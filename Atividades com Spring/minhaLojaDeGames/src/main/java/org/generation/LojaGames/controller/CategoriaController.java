package org.generation.LojaGames.controller;

import java.util.List;
import org.generation.LojaGames.model.Categoria;
import org.generation.LojaGames.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/categoria")
public class CategoriaController {
   
	@Autowired
	private CategoriaRepository repository;
	
	//
	
	@GetMapping  
	public ResponseEntity<List<Categoria>> FindAllCategoria(){
		return ResponseEntity.ok(repository.findAll());		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Categoria> FindAllByCategoria(){
		return null;
		
	}
}
