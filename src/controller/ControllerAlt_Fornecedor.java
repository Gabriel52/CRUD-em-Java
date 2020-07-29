/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Fornecedor;
import view.Alterar_Fornecedor;

/**
 *
 * @author gabri
 */
public class ControllerAlt_Fornecedor {
    private final Alterar_Fornecedor tela;
    
    public ControllerAlt_Fornecedor(Alterar_Fornecedor tela){
        this.tela = tela;
    }
    public void AlterarFornecedor(Fornecedor fornecedor, String codigo, String nome, String email, String cnpj, String telefone){
        if(codigo.isEmpty() || nome.isEmpty() || email.isEmpty() || cnpj.isEmpty() || telefone.isEmpty()){
            tela.exibirMensagem("Preencha todos os campos \n Preencha os campos corretamente");
        }else{
            DAO.DaoFornecedor dFornecedor = new DAO.DaoFornecedor();
            dFornecedor.alterar(fornecedor, codigo);
            tela.exibirMensagem("Alterado com sucesso");
        
        }
    }
}
