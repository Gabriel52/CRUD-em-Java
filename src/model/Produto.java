/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author gabri
 */
public class Produto {
    private String nome;
    private String data;
    private String preco;
    private String quantidade;
    private String fornecedor;
    private String categoria;


    public Produto(String nome, String data, String preco, String quantidade, String categoria, String fornecedor) {
        this.nome = nome;
        this.data = data;
        this.preco = preco;
        this.categoria = categoria;
        this.fornecedor = fornecedor;
        this.quantidade = quantidade;
        
    }
     public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }
    
}
