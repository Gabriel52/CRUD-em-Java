/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;
import model.Produto;
import view.cad_Produtos;

/**
 *
 * @author gabri
 */
public class ControllerCad_Produto {
    private final view.cad_Produtos tela;
    
    public ControllerCad_Produto(cad_Produtos tela){
        this.tela = tela;
    
    }
    public void cadastrarProduto(Produto produto, String nome,String data,String quantidade, String preco ){
        if(nome.isEmpty() || data.isEmpty() || quantidade.isEmpty() || preco.isEmpty()){
            tela.exibirMensagem("É necessario preencher todos os campos\n preencha os campos corretamente");
        }else{
            DAO.DaoProduto dProduto = new DAO.DaoProduto();
            dProduto.adicionar(produto);
            tela.exibirMensagem("Cadastro concluido com sucesso");
            
        }
        
    }
    
}
