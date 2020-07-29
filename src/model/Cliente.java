/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author gabri
 */
public class Cliente extends Pessoa {
   private String cpe; 
   
   public Cliente(String cpe, String nome, String cpf){
       super(nome, cpf);
       this.cpe = cpe;
   }

    public String getCpe() {
        return cpe;
    }

    public void setCpe(String cpe) {
        this.cpe = cpe;
    }
    
    
}
