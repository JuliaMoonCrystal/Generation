package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class helloControler {

	/*A aplicação deverá conter um end-point que retorna uma string com 
	 * as habilidades e mentalidades que você utilizou para realizar essa atividade.*/
	
	@GetMapping
	public String hello() {
		String texto="<h1>As mentalidades que eu usei para realizar essa atividade foram : "
				+ " <br>Persistência e Mentalidade de Crescimento<br>"
				+ "<br> E as habilidades foram :"
				+ "<br>Atenção aos Detalhes e Proatividade</h1>";
		
		return texto; 

	}
	       
}
