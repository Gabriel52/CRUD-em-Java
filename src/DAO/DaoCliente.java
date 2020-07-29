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
import model.Cliente;

/**
 *
 * @author gabri
 */
public class DaoCliente {
    private java.sql.Connection conexao = ConnectionFactory.getConnection();
    
    
    public void adicionar(Cliente cliente){
        String inserir = "insert into cliente (nome_cliente, cpf, cpe) values (?, ?, ?);";
        
        try{
            PreparedStatement dados = conexao.prepareStatement(inserir);
            dados.setString(1, cliente.getNome());
            dados.setString(2, cliente.getCpf());
            dados.setString(3, cliente.getCpe());
            
            dados.execute();
            dados.close();
            
        }catch(SQLException error){
            throw new RuntimeException(error);
        } 
    }
    //este método não é void pois ele vai possuir um retorno, por isso o tipo ResultSet
    public ResultSet listar(){
        
        String sql = "Select * from cliente";
        ResultSet dados;
        try{
            PreparedStatement stmt = conexao.prepareStatement(sql);
            dados = stmt.executeQuery();
            return dados;
            
        }catch(SQLException error){
            throw new RuntimeException(error);
       }
    }
    public void excluir(int id){
        String sql = "delete from cliente where ID_cliente = ?";
        
        try{
            PreparedStatement stmd = conexao.prepareStatement(sql);
            stmd.setInt(1, id);
            stmd.execute();
            stmd.close();
            
        }catch(SQLException error){
            throw new RuntimeException(error);
        }
    
    }
    public void alterar( Cliente cliente, String codigo ){
        String alterar = "UPDATE cliente SET nome_cliente = ?, cpf = ?, cpe = ?  WHERE (ID_cliente = ?)";
        try{
            PreparedStatement dados = conexao.prepareStatement(alterar);
            dados.setString(1, cliente.getNome());
            dados.setString(2, cliente.getCpf());
            dados.setString(3, cliente.getCpe());
            dados.setString(4, codigo);
            dados.execute();
            dados.close();
            
        }catch(SQLException error){
            throw new RuntimeException(error);
        }
    
    }
   
   
}
