/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;
import model.Funcionarios;
import view.cad_Funcionarios;

/**
 *
 * @author gabri
 */
public class ControllerCad_Funcionario {
    private final view.cad_Funcionarios tela;
    
    public  ControllerCad_Funcionario(cad_Funcionarios tela){
        this.tela = tela;
    }
    
    public void cadastrarFuncionario(Funcionarios funcionario, String nome, String cpf, String Rg, String cpe, String telefone, String categoria ){
        if( nome.isEmpty() || cpf.isEmpty() || Rg.isEmpty() || cpe.isEmpty() || telefone.isEmpty() || categoria.isEmpty()){
            tela.exibirMensagem( "Preencha todos os campos corretament \n Preencher os campos");
        }else{
            DAO.DaoFuncionario dFuncionario = new DAO.DaoFuncionario();
            dFuncionario.adicionar(funcionario);
            tela.exibirMensagem("Cadastrado com sucesso");
        }
    }
}       

