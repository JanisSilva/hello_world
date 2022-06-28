package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/BSM")

public class BSM {
	
	@GetMapping
	public String BSMLista() {
		return " PT - BSM-0 - Introdução às Habilidades Comportamentais e Mentalidades\r\n"
				+ " PT - BSM-GM - Mentalidade de Crescimento\r\n"
				+ " PT - BSM-P - Persistência\r\n"
				+ " PT - BSM-PR - Responsabilidade Pessoal\r\n"
				+ " PT - BSM-FO - Orientação ao Futuro\r\n"
				+ " PT - BSM-C - Comunicação\r\n"
				+ " PT - BSM-OD - Orientação ao Detalhe\r\n"
				+ " PT - BSM-PA - Proatividade";
	}
}
