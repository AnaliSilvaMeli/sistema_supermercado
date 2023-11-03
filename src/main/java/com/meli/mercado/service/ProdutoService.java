package com.meli.mercado.service;

import com.meli.mercado.dto.ProdutoDto;
import com.meli.mercado.model.Produto;
import com.meli.mercado.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public String adicionar(ProdutoDto produtoDto){
        if(produtoDto.getNome() != null){
        Produto produto = new Produto();
        produto.setId(produtoDto.getId());
        produto.setNome(produtoDto.getNome());
        produto.setValor(produtoDto.getValor());

        produtoRepository.adicionar(produto);
        return "Novo produto salvo no banco de dados";
        }
        return "Parâmetros incorretos!";
    }

    public List<Produto> listar(){
        return produtoRepository.findAll();
    }

}
