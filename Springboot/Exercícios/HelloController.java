package br.org.generation.helloword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/bsm") //localhost:8080/hello
public class HelloController {
	
	@GetMapping
	public String mostrarHello() {
		return "Habilidades e mentalidades utilizadas para realização das tarefas:"
				+ " Mentalidade de crescimento, persistência e atenção aos detalhes.";
	}
}
