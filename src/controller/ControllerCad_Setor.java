/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;
import view.cad_Setor;
import model.Setor;
import view.Alterar_setor;

/**
 *
 * @author gabri
 */
public class ControllerCad_Setor {
    private final cad_Setor tela;
   
    
    public ControllerCad_Setor(cad_Setor tela ){
        this.tela = tela;
    }
    
    public void cadastarSetor(Setor setor, String nome){
        
        if(nome.isEmpty()){
            tela.exibirMensagem("Preencha todos os campos");
        }else{ 
           //model.Setor moSetor = new model.Setor();
           //int idCombo = setor.getCategoria();
           //setor.setNome(.getText());
           //setor.setCategoria(idCombo);
           DAO.DaoSetor adicionar = new DAO.DaoSetor();
           adicionar.adicionar(setor);
           tela.exibirMensagem("Cadastrado com sucesso");
           
        
        }
    }
    
}
