package br.com.alisson.exerciciossb.model.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.alisson.exerciciossb.model.entities.Produto;

// Produto = tipo de entidade que o repositorio sera responsavel por persistir
// Integer = tipo da variavel ID
public interface ProdutoRepository 
	extends PagingAndSortingRepository<Produto, Integer> {

	// Seguindo as convençoes essa função é automaticamente gerado pelo framework
	public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);
}
