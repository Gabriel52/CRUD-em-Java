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
import model.Funcionarios;


/**
 *
 * @author gabri
 */
public class DaoFuncionario {
    private java.sql.Connection conexao = ConnectionFactory.getConnection();
   
    
     public void adicionar(Funcionarios funcionario){
        String inserir = "insert funcionario (nome_funcionario, rg, cpf, cpe, telefone, FK_setor) values (?, ?, ?, ?, ?, ?);";

        try{
            PreparedStatement dados = conexao.prepareStatement(inserir);
            dados.setString(1, funcionario.getNome());
            dados.setString(2, funcionario.getCpf());
            dados.setString(3, funcionario.getRg());
            dados.setString(4, funcionario.getCpe());
            dados.setString(5, funcionario.getTelefone());
            dados.setString(6, funcionario.getSetor());
            dados.execute();
            dados.close();
                 
            
        }catch(SQLException error){
            throw new RuntimeException(error);
        }
    }
    public ResultSet listar(){
        String sql = "select* from funcionario";
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
        String sql = "delete from funcionario where ID_funcionario = ?";
        
        try{
            PreparedStatement stmd = conexao.prepareStatement(sql);
            stmd.setInt(1, id);
            stmd.execute();
            stmd.close();
            
        }catch(SQLException error){
            throw new RuntimeException(error);
        }
    }
    public void alterar(Funcionarios funcionario,String codigo){
        String inserir = "UPDATE funcionario SET nome_funcionario = ?, rg = ? , cpf = ?, cpe = ? , telefone = ?, FK_setor = ? WHERE ID_funcionario = ?";
                          
        try{
            PreparedStatement dados = conexao.prepareStatement(inserir);
            dados.setString(1, funcionario.getNome());
            dados.setString(2, funcionario.getCpf());
            dados.setString(3, funcionario.getRg());
            dados.setString(4, funcionario.getCpe());
            dados.setString(5, funcionario.getTelefone());
            dados.setString(6, funcionario.getSetor());
            dados.setString(7, codigo);
            
            dados.execute();
            dados.close();
                 
            
        }catch(SQLException error){
            throw new RuntimeException(error);
        }
    }
}