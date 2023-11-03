package com.meli.mercado.repository;

import com.meli.mercado.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
    void adicionar(Produto produto);
}
