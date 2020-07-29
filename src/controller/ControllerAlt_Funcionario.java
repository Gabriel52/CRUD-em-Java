/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Funcionarios;
import model.Produto;
import view.Alterar_Funcionarios;

/**
 *
 * @author gabri
 */
public class ControllerAlt_Funcionario {
    private final Alterar_Funcionarios tela;
    
    public ControllerAlt_Funcionario(Alterar_Funcionarios tela){
        this.tela = tela;
    }
    
    
    public void AlterarFuncionario(Funcionarios funcionario, String codigo, String nome, String rg, String cpf, String cpe, String telefone){
        if(codigo.isEmpty() || nome.isEmpty() || rg.isEmpty() || cpf.isEmpty() || cpe.isEmpty() || telefone.isEmpty()){
            tela.exibirMensagem("Preencha todos os campos \n Preencha os campos corretamente");
        }else{
            DAO.DaoFuncionario dFuncionario = new DAO.DaoFuncionario();
            dFuncionario.alterar(funcionario, codigo);
            tela.exibirMensagem("Alterado com sucesso");
        }
    }
    
}

