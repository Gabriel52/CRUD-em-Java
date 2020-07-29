/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Setor;
import view.Alterar_setor;

/**
 *
 * @author gabri
 */
public class ControllerAlt_Setor {
    private final Alterar_setor telaAlt;
    
    public ControllerAlt_Setor(Alterar_setor telaAlt){
        this.telaAlt = telaAlt;
    }
    public void AlterarSetor(Setor setor, String nome, String codigo){
        if(nome.isEmpty() || codigo.isEmpty()){
            telaAlt.exibirMensagem("Preencha todos os campos");
        }else{ 
           //model.Setor moSetor = new model.Setor();
           //int idCombo = setor.getCategoria();
           //setor.setNome(.getText());
           //setor.setCategoria(idCombo);
           DAO.DaoSetor adicionar = new DAO.DaoSetor();
           adicionar.adicionar(setor);
           telaAlt.exibirMensagem("Alterado com sucesso");
           
        
        } 
    }
}