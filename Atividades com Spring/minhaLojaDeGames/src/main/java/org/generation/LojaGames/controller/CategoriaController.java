package org.generation.LojaGames.controller;

import java.util.List;
import org.generation.LojaGames.model.Categoria;
import org.generation.LojaGames.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/categoria")
public class CategoriaController {
   
	@Autowired
	private CategoriaRepository repository;
	
	//
	
	@GetMapping  // vai retornar todos os itens da categoria
	public ResponseEntity<List<Categoria>> FindAllCategoria(){
		return ResponseEntity.ok(repository.findAll());		
	}
	
	@GetMapping("/{id}")  //vai retornar o item conforme o id passado
	public ResponseEntity<Categoria> FindAllByCategoria(@PathVariable long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());	
	}
	
	@GetMapping("/descricao/{descricao}") //vai retornar todas as descrição passadas
	public ResponseEntity<List<Categoria>> FindByDescricao(@PathVariable String descricao){
		return ResponseEntity.ok(repository.findAllByDescricaoContainingIgnoreCase(descricao));	
	}
	
	@PostMapping   // adiciona uma nova categoria
	public ResponseEntity<Categoria> posCategoria(@RequestBody Categoria categoria){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(categoria));		
	}
	
	@PutMapping
	public ResponseEntity<Categoria> putCategoria(@RequestBody Categoria categoria){
		return ResponseEntity.ok(repository.save(categoria));
		
	}
	
	@DeleteMapping("/{id}")
	public void DeleteCategoria(@PathVariable long id) {
		repository.deleteById(id);
	}
	
}
