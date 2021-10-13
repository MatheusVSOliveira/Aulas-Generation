package br.org.generation.lojadegames.model;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class UsuarioTest 
{
	public Usuario usuario;
	public Usuario usuarioErro = new Usuario();
	
	private ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
	Validator validator = factory.getValidator();
	
	@BeforeEach
	public void start() 
	{
		usuario = new Usuario(0L,"Matheus Oliveira", "matheus@email.com", "12345678", "vendedor");
	}
	
	@Test
	@DisplayName("Valida atributos não nulos")
	void testValidaAtributos() 
	{
		Set<ConstraintViolation<Usuario>> violacao = validator.validate(usuario);
		
		System.out.println(violacao.toString());
		
		assertTrue(violacao.isEmpty());
	}
	
	@Test
	@DisplayName("Não valida atributos nulos")
	void testNaoValidaAtributos() 
	{
		Set<ConstraintViolation<Usuario>> violacao = validator.validate(usuarioErro);
		System.out.println(violacao.toString());
		assertFalse(violacao.isEmpty());
	}
}










