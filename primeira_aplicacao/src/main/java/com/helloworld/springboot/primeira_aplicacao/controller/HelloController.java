package com.helloworld.springboot.primeira_aplicacao.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hello")
@CrossOrigin (origins = "*", allowedHeaders = "*")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "As habilidades e mentalidades utilizadas para desenvolver essa atividade foram: Persistência, Responsabilidade pessoal, Comunicação"
				+ " e Trabalho em Equipe.";
	}

}
