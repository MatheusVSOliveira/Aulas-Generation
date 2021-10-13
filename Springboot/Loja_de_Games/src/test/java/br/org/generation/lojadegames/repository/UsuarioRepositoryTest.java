package br.org.generation.lojadegames.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import br.org.generation.lojadegames.model.Usuario;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UsuarioRepositoryTest 
{
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@BeforeAll
	void start() 
	{
		Usuario usuario = new Usuario(0,"Matheus Oliveira", "matheus@email.com", "123456789", "comprador");
		if(!usuarioRepository.findByUsuario(usuario.getUsuario()).isPresent()) 
		{
			usuarioRepository.save(usuario);
		}
		
		usuario = new Usuario(0,"Manuella Oliveira", "manuella@email.com", "123456789", "comprador");
		if(!usuarioRepository.findByUsuario(usuario.getUsuario()).isPresent()) 
		{
			usuarioRepository.save(usuario);
		}
		
		usuario = new Usuario(0,"Marcos Oliveira", "marcos@email.com", "123456789", "comprador");
		if(!usuarioRepository.findByUsuario(usuario.getUsuario()).isPresent()) 
		{
			usuarioRepository.save(usuario);
		}
		
		usuario = new Usuario(0,"Eduardo Oliveira", "eduardo@email.com", "123456789", "comprador");
		if(!usuarioRepository.findByUsuario(usuario.getUsuario()).isPresent()) 
		{
			usuarioRepository.save(usuario);
		}
	}
	
	//Testa o método findByNome()
	@Test
	@DisplayName("💾 Retorna o nome")
	public void findByNomeRetornaNome() throws Exception 
	{
		Usuario usuario = usuarioRepository.findByNome("Matheus Oliveira");
		assertTrue(usuario.getNome().equals("Matheus Oliveira"));
	}
	
	//Testa o método FindAllByNomeContainingIgnoreCase()
	@Test
	@DisplayName("💾 Retorna 4 usuarios")
	public void FindAllByNomeContainingIgnoreCaseRetornaTresUsuarios() 
	{
		List <Usuario> listaDeUsuarios = usuarioRepository.findAllByNomeContainingIgnoreCase("Oliveira");
		assertEquals(4, listaDeUsuarios.size());
	}
		
	@AfterAll
	public void end() 
	{
		usuarioRepository.deleteAll();
	}
	
}
