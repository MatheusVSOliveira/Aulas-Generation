package br.org.generation.helloword2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/objetivos")
public class HelloController2 
{
	
	@GetMapping
	public String objetivo() 
	{
		return "Os meus objetivos de aprendizagem essa semana será absorver o máximo"
				+ " de conteúdo possível passado pelos instrutores.";
	}
}
