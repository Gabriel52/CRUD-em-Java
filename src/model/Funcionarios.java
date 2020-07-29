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
public class Funcionarios extends Pessoa{
    private String rg;
    private String telefone;
    private String cpe;
    private String setor;
    
     public Funcionarios(String nome, String cpf, String rg, String cpe, String telefone, String setor) {
        super(nome, cpf);
        this.rg = rg;
        this.telefone = telefone;
        this.cpe = cpe;
        this.setor = setor;
    }
    
     public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpe() {
        return cpe;
    }

    public void setCpe(String cpe) {
        this.cpe = cpe;
    }
    
    public Funcionarios(String nome, String cpf) {
        super(nome, cpf);
        this.rg = rg;
        
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

}
    
    

