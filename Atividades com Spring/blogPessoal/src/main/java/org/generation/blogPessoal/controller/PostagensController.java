package org.generation.blogPessoal.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.generation.blogPessoal.model.Postagem;
import org.generation.blogPessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/postagens")
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class PostagensController {
    
	@Autowired
	private PostagemRepository repository;
    
	//vai retornar todos os dados da tabela
	@GetMapping
	public ResponseEntity<List<Postagem>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
		
	}
	
	// pegando pelo id
	@GetMapping("/{id}")
	public ResponseEntity<Postagem> GetById(@PathVariable long id){
		 return repository.findById(id)
		           .map(resp -> ResponseEntity.ok().body(resp))
		           .orElse(ResponseEntity.notFound().build());
		
	}
	
	// pegando pelo nome
	@GetMapping("/titulo/{titulo}")
	public ResponseEntity <List<Postagem>> GetByNome(@PathVariable String titulo){
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
		
	}
	
}
