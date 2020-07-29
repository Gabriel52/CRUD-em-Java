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
import model.Setor;

/**
 *
 * @author gabri
 */
public class DaoSetor {
    private java.sql.Connection conexao = ConnectionFactory.getConnection();
    
    
    public void adicionar(Setor setor){
        String sql = "insert into setor (nome_setor, FK_categoria_setor) values(?, ?)";
        try{ 
        PreparedStatement dados = conexao.prepareStatement(sql);
        dados.setString(1, setor.getNome());
        dados.setInt(2, setor.getCategoria());
       
        dados.execute();
        dados.close();
        
      }catch(SQLException error){
          throw new RuntimeException(error);
      }
    }
    public ResultSet listar(){
       String sql = "select * from setor";
       ResultSet dados;
       try{
           PreparedStatement stmd = conexao.prepareStatement(sql);
           dados = stmd.executeQuery();
           return dados;
           
       }catch(SQLException error){
           throw new RuntimeException(error);
       }
    
    }
     public void excluir(int id){
        String sql = "delete from setor where ID_setor = ?";
        
        try{
            PreparedStatement stmd = conexao.prepareStatement(sql);
            stmd.setInt(1, id);
            stmd.execute();
            stmd.close();
            
        }catch(SQLException error){
            throw new RuntimeException(error);
        }
    }
    public void alterar(Setor setor, String codigo){
        String sql = "UPDATE  setor SET nome_setor = ?, FK_categoria_setor= ? WHERE ID_setor =?";
        try{ 
        PreparedStatement dados = conexao.prepareStatement(sql);
        dados.setString(1, setor.getNome());
        dados.setInt(2, setor.getCategoria());
        dados.setString(3, codigo);
       
        dados.execute();
        dados.close();
        
      }catch(SQLException error){
          throw new RuntimeException(error);
      }
    }
    
}
