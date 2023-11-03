package com.meli.mercado.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.util.Optional;

@Entity
@Table(name = "produto")
public class Produto {
    @Id
    @Column(name = "id_produto")
    private Integer id;

    @Column
    private String nome;

    @Column
    private BigDecimal valor;

    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public BigDecimal getValor(){
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
