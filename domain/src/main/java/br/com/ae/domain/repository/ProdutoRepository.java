package br.com.ae.domain.repository;

import br.com.ae.domain.model.Produto;

import java.util.List;
import java.util.Optional;

public interface ProdutoRepository {
    Optional<Produto> findByCodigo(String codigo);
    Produto save(Produto produto);
    List<Produto> findByCategoriaNome(String nomeCategoria);
    List<Produto> findAll();
}
