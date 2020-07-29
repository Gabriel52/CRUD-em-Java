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
public class Setor {
    private String nome;
    private int categoria;

     //public Setor(String nome, String categoria) {
//        this.nome = nome;
//        this.categoria = categoria;
//    }
     
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

  
    public Setor(String nome, int categoria){
        this.nome = nome;
        this.categoria = categoria;
    }
    
    public Setor(){
        
    }
    
}
   

    
