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
import model.Categoria;

/**
 *
 * @author gabri
 */
public class DaoCategoria {
    private java.sql.Connection conexao = ConnectionFactory.getConnection();
    
    
    public void adicionar(Categoria categoria){
        String inserir = "insert into categoria (nome_categoria) values (?);";
        try{
            PreparedStatement dados = conexao.prepareStatement(inserir);
            dados.setString(1, categoria.getCategoria());
            dados.execute();
            dados.close();
            
        }catch(SQLException error){
            throw new RuntimeException(error);
        }
    
    }
    public ResultSet listar(){
        String sql = "select * from categoria";
        ResultSet dados;
        try{
            PreparedStatement stmd = conexao.prepareStatement(sql);
            dados = stmd.executeQuery();
            return dados;
            
        }catch(SQLException error){
            throw new RuntimeException(error);
        }
        
    } public void excluir(int id){
        String sql = "delete from categoria where ID_categoria = ?";
        
        try{
            PreparedStatement stmd = conexao.prepareStatement(sql);
            stmd.setInt(1, id);
            stmd.execute();
            stmd.close();
            
        }catch(SQLException error){
            throw new RuntimeException(error);
        }
    }
     public void alterar(Categoria categoria, String codigo){
        String alterar = "update categoria set nome_categoria = ? where ID_categoria = ?;";
        try{
            PreparedStatement dados = conexao.prepareStatement(alterar);
            dados.setString(1, categoria.getCategoria());
            dados.setString(2, codigo);
            dados.execute();
            dados.close();
            
        }catch(SQLException error){
            throw new RuntimeException(error);
        }
    
    }
     
}