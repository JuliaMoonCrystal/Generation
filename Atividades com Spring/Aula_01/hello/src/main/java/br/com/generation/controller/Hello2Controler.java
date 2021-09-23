package br.com.generation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class Hello2Controler {

	@GetMapping()
	
	public String hello2() {
		String texto="<h1>Meus objetivos de aprendizagem para essa semana:</h1><br>"
				+ "<h1><ol>"
				+ "<li> Aprender mais sobre Spring</li>"
				+ "<li> Apresender mais sobre MySQL</li>"
				+ "<li>Aprender mais sobre Java</li>"
				+ "</ol></h1>";
		
		return texto;
	}
	
}
