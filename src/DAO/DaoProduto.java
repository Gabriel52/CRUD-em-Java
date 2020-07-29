/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Factory.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Produto;


/**
 *
 * @author gabri
 */
public class DaoProduto {
    private java.sql.Connection conexao = ConnectionFactory.getConnection();
    
    
    public void adicionar(Produto produto){
        String inserir = "insert into produto (nome_produto, data_validade, preco, quantidade_produto, FK_categoria, FK_fornecedor) values (?, ?, ?, ?, ?, ? );";
        try{
            PreparedStatement dados = conexao.prepareStatement(inserir);
            dados.setString(1, produto.getNome());
            dados.setString(2, produto.getData());
            dados.setString(3, produto.getPreco());
            dados.setString(4, produto.getQuantidade());
            dados.setString(5, produto.getCategoria());
            dados.setString(6, produto.getFornecedor());
            dados.execute();
            dados.close();
                 
            
        }catch(SQLException error){
            throw new RuntimeException(error);
        }
    }
    public ResultSet lista(){
        String sql = "select *from produto";
        ResultSet dados;
        try{
            PreparedStatement psmd = conexao.prepareStatement(sql);
            dados = psmd.executeQuery();
            return dados;
            
        }catch(SQLException error){
        throw new RuntimeException (error);
        
        }
        
    }
     public void excluir(int id){
        String sql = "delete from produto where ID_produto = ?";
        
        try{
            PreparedStatement stmd = conexao.prepareStatement(sql);
            stmd.setInt(1, id);
            stmd.execute();
            stmd.close();
            
        }catch(SQLException error){
            throw new RuntimeException(error);
        }
    }
        public void alterar(Produto produto, String codigo){
        String inserir = "UPDATE produto SET nome_produto = ?, data_validade = ?, preco = ?, quantidade_produto = ?, FK_categoria = ?, FK_fornecedor = ? WHERE ID_produto = ?;";
        try{
            PreparedStatement dados = conexao.prepareStatement(inserir);
            dados.setString(1, produto.getNome());
            dados.setString(2, produto.getData());
            dados.setString(3, produto.getPreco());
            dados.setString(4, produto.getQuantidade());
            dados.setString(5, produto.getCategoria());
            dados.setString(6, produto.getFornecedor());
            dados.setString(7, codigo);
            dados.execute();
            dados.close();
                 
            
        }catch(SQLException error){
            throw new RuntimeException(error);
        }
    }
     
}