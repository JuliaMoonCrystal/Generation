package org.generation.minhFarmacia.repository;

import java.util.List;

import org.generation.minhFarmacia.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutosRepository extends JpaRepository<Produto, Long> {

	public List<Produto> findAllByNomeContainingIgnoreCase(String nome);
}
