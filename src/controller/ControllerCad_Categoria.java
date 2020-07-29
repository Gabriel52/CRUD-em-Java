/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.nio.file.Files;
import javax.swing.JOptionPane;
import model.Categoria;
import view.cad_Categoria;

/**
 *
 * @author gabri
 */
public class ControllerCad_Categoria {
    private final cad_Categoria tela;
    
    public ControllerCad_Categoria(cad_Categoria tela){
        this.tela = tela;
    }
    public void cadastrarCategoria(Categoria categoria, String nome ){
    if(nome.isEmpty()){
        tela.exibirMensagem("Preencha todos os campos \n Campos preenchidos incorretamente");
    }else{
        DAO.DaoCategoria DCategoria = new DAO.DaoCategoria();
        DCategoria.adicionar(categoria);
        tela.exibirMensagem("Cadastrado com sucesso");
             
              
    
    }
    }
}
