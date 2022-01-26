package com.helloworld2.springboot.segunda_aplicacao.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hello2")
@CrossOrigin (origins = "*", allowedHeaders = "*")
public class Hello2Controller {
	
	@GetMapping
	public String hello2() {
		return "Os meus objetivos de aprendizagem para essa semana são: melhorar a minha capacidade de persistência, orientação ao futuro, comunicação,"
				+ " trabalho em equipe e proatividade.";
	}
}
