/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;
/**
 *
 * @author gabri
 */
public class teste {
     public static void main(String[] args) {
      new ConnectionFactory().getConnection();
        System.out.println("Conexão Realizada com sucesso");
  
     }
}
