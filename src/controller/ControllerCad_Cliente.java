/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Cliente;
import view.cad_Cliente;

/**
 *
 * @author gabri
 */
public class ControllerCad_Cliente {
    private final cad_Cliente tela;
    
    public ControllerCad_Cliente(cad_Cliente tela){
        this.tela = tela;
    }
    public void cadastrarCliente(Cliente cliente, String nome, String cpf, String cpe){
        if(nome.isEmpty() || cpf.isEmpty() || cpe.isEmpty()){
            tela.exibirMensagem("Preencha todos os campos \n Campos preenchidos incorretamente");
        }else{
            DAO.DaoCliente DclCliente = new DAO.DaoCliente();
            DclCliente.adicionar(cliente);
            tela.exibirMensagem("Cadastrado com sucesso");
        }
        
    }
}
