package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Objetivos")

public class Objetivos {
	
	@GetMapping
	public String ObjetivosDeAprendizagem() {
		return "Melhorar comunicação\r\n"
				+ "Persistir mais em meus objetivos\r\n"
				+ "Trabalhar mais em equipe";
	}
}
