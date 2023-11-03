package com.meli.mercado.controller;

import com.meli.mercado.dto.ProdutoDto;
import com.meli.mercado.model.Produto;
import com.meli.mercado.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> listar() {
        return produtoService.listar();
    }

    @PostMapping
    public String adicionar(@RequestBody ProdutoDto produtoDto){
        return produtoService.adicionar(produtoDto);
    }

}
