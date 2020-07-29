/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Cliente;
import view.Alterar_cliente;

/**
 *
 * @author gabri
 */
public class ControllerAlt_Cliente {
    private final Alterar_cliente tela;
    
    public ControllerAlt_Cliente( Alterar_cliente tela) {
        this.tela = tela;
    }
    public void AlterarCliente(Cliente cliente, String codigo, String nome, String cpf, String cpe){
        if(codigo.isEmpty() || nome.isEmpty() || cpf.isEmpty() || cpe.isEmpty()){
            tela.exibirMensagem("Preencha todos os campos \n Preencha os campos corretamente");
        
        }else{
            DAO.DaoCliente DclCliente = new DAO.DaoCliente();
            DclCliente.alterar(cliente, codigo);
            tela.exibirMensagem("Alterado com sucesso");
        }
    }
}
