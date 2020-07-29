/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;
import model.Produto;
import view.Alterar_produtos;

/**
 *
 * @author gabri
 */
public class ControllerAlt_Produto {
    private final Alterar_produtos tela;
    
    public ControllerAlt_Produto(Alterar_produtos tela){
        this.tela = tela;
    }
    public void alterarProduto(Produto produto,String  codigo ,String nome, String quantidade, String preco, String data){
        if(nome.isEmpty() || quantidade.isEmpty() || preco.isEmpty() || data.isEmpty() ){
            tela.exibirMensagem("Preencha todos os campos \n Preencha os campos corretamente");
        }
        else{
            DAO.DaoProduto DaoProduto = new DAO.DaoProduto();
            DaoProduto.alterar(produto, codigo);
            tela.exibirMensagem("Alterado com sucesso");
        }
    } 
    
}
