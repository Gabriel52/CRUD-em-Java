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

/**
 *
 * @author gabri
 */
public class DaoLogin {
    private java.sql.Connection conexao = ConnectionFactory.getConnection();
    
    public boolean consultar(String usuario, String senha){
        
        boolean autenticado = false;
        try{
            String sql = "SELECT usuario, senha FROM login WHERE usuario = ? and senha = ?;";
            PreparedStatement dados = conexao.prepareStatement(sql);
            
            dados.setString(1, usuario);
            dados.setString(2, senha);
            
            ResultSet retorno;
            retorno = dados.executeQuery();
            
            if(retorno.next()){
                autenticado = true;
            }
            
            dados.close();
            return autenticado;
            
        }catch(SQLException erro){
            throw new RuntimeException(erro);
        }
    }
    
}
