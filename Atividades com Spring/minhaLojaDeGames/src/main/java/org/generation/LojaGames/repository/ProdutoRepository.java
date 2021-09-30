package org.generation.LojaGames.repository;

import java.util.List;

import org.generation.LojaGames.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto,Long>{
	
	public List<Produto> findAllByTituloContainingIgnoreCase(String titulo);

}
