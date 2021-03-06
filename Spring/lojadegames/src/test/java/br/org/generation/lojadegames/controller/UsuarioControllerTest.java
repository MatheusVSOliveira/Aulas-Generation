package br.org.generation.lojadegames.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import br.org.generation.lojadegames.model.Usuario;
import br.org.generation.lojadegames.repository.UsuarioRepository;



@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UsuarioControllerTest 
{
	@Autowired
	private TestRestTemplate testRestTemplate;
	
	private Usuario usuario;
	private Usuario usuarioAdmin;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@BeforeAll
	public void start() 
	{
		usuarioAdmin = new Usuario(0,"Administrador","admin@email.com","admin123","adm");
		
		if(!usuarioRepository.findByUsuario(usuarioAdmin.getUsuario()).isPresent()) // verifica se o usuário já está cadastrado no banco de dados.
		{
			HttpEntity<Usuario> request = new HttpEntity<Usuario>(usuarioAdmin);
			testRestTemplate.exchange("/usuarios/cadastrar", HttpMethod.POST,request,Usuario.class); //requisição de cadastro
		}
		
		usuario = new Usuario(0,"Eduardo Oliveira","eduardo@email.com","123456789","vendedor");
	}	
	@Test
	@Order(1)
    @DisplayName("✔ Cadastrar Usuário!") 
	public void deveRealizarPostUsuario() 
	{
		HttpEntity<Usuario> request = new HttpEntity<Usuario>(usuario); // criando requisição
		
		ResponseEntity <Usuario> resposta = testRestTemplate
				.exchange("/usuarios/cadastrar", HttpMethod.POST, request, Usuario.class);
		assertEquals(HttpStatus.CREATED,resposta.getStatusCode());		
	}
	@Test
	@Order(2)
	@DisplayName("👍 Listar todos os Usuários!")
	public void deveMostrarTodosUsuarios() // não precisa de requisição
	{
		ResponseEntity<String> resposta = testRestTemplate
				.withBasicAuth("admin@email.com","admin123")
				.exchange("/usuarios/all",HttpMethod.GET,null,String.class);
		assertEquals(HttpStatus.OK, resposta.getStatusCode());
	}
}
