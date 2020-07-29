/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Categoria;
import view.Alterar_categoria;

/**
 *
 * @author gabri
 */
public class ControllerAlt_Categoria {
    private final Alterar_categoria tela;
    
    public ControllerAlt_Categoria(Alterar_categoria tela){
        this.tela = tela;
    }
    public void AlterarCategoria(Categoria categorias, String codigo, String categoria){
        if(codigo.isEmpty() || categoria.isEmpty()){
            tela.exibirMensagem("Preencha todos os campos \n Preencha os campos corretamente");
        }else{
            DAO.DaoCategoria DCategoria = new DAO.DaoCategoria();
            DCategoria.alterar(categorias, codigo);
            tela.exibirMensagem("Cadastrado com sucesso");
        }
    }
}
