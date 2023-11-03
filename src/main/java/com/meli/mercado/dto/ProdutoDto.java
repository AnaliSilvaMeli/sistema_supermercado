package com.meli.mercado.dto;

import java.math.BigDecimal;

public class ProdutoDto {
    private Integer id;
    private String nome;
    private BigDecimal valor;

    public Integer getId(){
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValor(){
        return valor;
    }
    public void setValor(BigDecimal valor){
        this.valor = valor;
    }
}
