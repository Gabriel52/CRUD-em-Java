/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;
import model.Fornecedor;
import view.cad_Fornecedor;

/**
 *
 * @author gabri
 */
public class ControllerCad_Fornecedor {
    private final cad_Fornecedor tela;
    
    public ControllerCad_Fornecedor(cad_Fornecedor tela){
        this.tela = tela;
    }
    
    public void cadastrarFornecedor(Fornecedor fornecedor, String nome, String email, String telefone, String cnpj){
        if(email.isEmpty() || telefone.isEmpty() || cnpj.isEmpty() || nome.isEmpty() ){
            tela.exibirMensagem("Preencha todos os campos \n Preencha os campos corretamente");
        }else{
            DAO.DaoFornecedor dFornecedor = new DAO.DaoFornecedor();
            dFornecedor.adicionar(fornecedor);
            tela.exibirMensagem("Cadastrado com sucesso");
        
        }
    }
}
