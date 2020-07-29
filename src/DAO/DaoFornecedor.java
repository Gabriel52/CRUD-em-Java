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
public class DaoFornecedor {
    private java.sql.Connection conexao = ConnectionFactory.getConnection();
   
    
    public void adicionar(Fornecedor fornecedor){
         String inserir = "insert into fornecedor (nome_fornecedor, cnpj, email, telefone) values (?, ?, ?, ?);";
        try{
            PreparedStatement dados = conexao.prepareStatement(inserir);
            dados.setString(1, fornecedor.getNome());
            dados.setString(2, fornecedor.getCnpj());
            dados.setString(3, fornecedor.getEmail());
            dados.setString(4, fornecedor.getTelefone());
            
            
            dados.execute();
            dados.close();
                 
            
        }catch(SQLException error){
            throw new RuntimeException(error);
        }
    }
    public ResultSet listar(){
        String sql = "select *from fornecedor";
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
        String sql = "delete from fornecedor where ID_fornecedor = ?";
                                                 
        try{
            PreparedStatement stmd = conexao.prepareStatement(sql);
            stmd.setInt(1, id);
            stmd.execute();
            stmd.close();
            
        }catch(SQLException error){
            throw new RuntimeException(error);
        }
    }public void alterar(Fornecedor fornecedor, String codigo){
         String alterar = "UPDATE fornecedor SET nome_fornecedor = ?, email = ?, cnpj = ?, telefone = ? WHERE ID_fornecedor = ?" ;
        try{
            PreparedStatement dados = conexao.prepareStatement(alterar);
            dados.setString(1, fornecedor.getNome());
            dados.setString(2, fornecedor.getEmail());
            dados.setString(3, fornecedor.getCnpj());
            dados.setString(4, fornecedor.getTelefone());
            dados.setString(5, codigo);
            
            
            dados.execute();
            dados.close();
                 
            
        }catch(SQLException error){
            throw new RuntimeException(error);
        }
    }
}
