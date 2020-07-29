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
import model.Fornecedor;


/**
 *
 * @author gabri
 */
public class DaoEstoque {
    private java.sql.Connection conexao = ConnectionFactory.getConnection();
    
    
    public ResultSet listar(){
        String sql = "select p.ID_produto, p.nome_produto, p.data_validade, p.quantidade_produto, f.nome_fornecedor from produto as p join fornecedor as f on Fk_fornecedor = ID_fornecedor ;";
        ResultSet dados;
        try{
            PreparedStatement stmd = conexao.prepareStatement(sql);
            dados = stmd.executeQuery();
            return dados;
            
        }catch(SQLException error){
            throw new RuntimeException(error);
        }
    }
    public ResultSet listarPeps(){
        String sql = "select p.ID_produto, p.nome_produto, p.data_validade, p.quantidade_produto, f.nome_fornecedor from produto as p join fornecedor as f on Fk_fornecedor = ID_fornecedor order by  p.data_validade;";
        ResultSet dados;
      
        try{
            PreparedStatement stmd = conexao.prepareStatement(sql);
            dados = stmd.executeQuery();
            return dados;
            
        }catch(SQLException error){
            throw new RuntimeException(error);
        }
    }
    public ResultSet listarUeps(){
        String sql = "select p.ID_produto, p.nome_produto, p.data_validade, p.quantidade_produto, f.nome_fornecedor from produto as p join fornecedor as f on Fk_fornecedor = ID_fornecedor order by  p.data_validade desc;";
        ResultSet dados;
      
        try{
            PreparedStatement stmd = conexao.prepareStatement(sql);
            dados = stmd.executeQuery();
            return dados;
            
        }catch(SQLException error){
            throw new RuntimeException(error);
        }
    }

}
