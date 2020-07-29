/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;
import view.Login;
import view.Menu;

/**
 *
 * @author gabri
 */
public class ControllerLogin {
    private final Login tela;
    
    public ControllerLogin(Login tela ){
        this.tela = tela;
    }
    
    public void realizarLogin(String usuario, String senha){
        if(usuario.equals("") || senha.equals("")){
            tela.exibirMensagem("Preencha todos os campos");
        }else{
            DAO.DaoLogin login = new DAO.DaoLogin();
            boolean resposta = login.consultar(usuario, senha);
        
            if(resposta == true){
            JOptionPane.showMessageDialog(null, "Login efetuado com sucesso");
            tela.dispose();
            new Menu().setVisible(true);
            
        }else{
            tela.exibirMensagem("Login incorreto. \n Por favor, verifique seus dados, cadastro negado");
        }
            
        }
    }
}
