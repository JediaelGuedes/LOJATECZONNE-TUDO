/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author USER
 */
public class JG_Clientess {
    private int id;
    public String JG_nome;
    public int JG_Idade;
    public int JG_cpf;
    public int JG_cep;
    public String JG_endereço;

     public JG_Clientess(){}
     
    public void setJG_nome(String JG_nome){
        this.JG_nome=JG_nome;
    }
    public String getJG_nome(){
        return this.JG_nome;
    }
    
    public void setJG_cpf(int JG_cpf){
    this.JG_cpf=JG_cpf;
    }
    
    public int getJG_cpf(){
    return this.JG_cpf;
    }
    public void setJG_cep(int JG_cep){
    this.JG_cep=JG_cep;
    }
    public int getJG_cep(){
        return this.JG_cep;
    }
    public void setJG_endereço(String JG_endereço){
        this.JG_endereço=JG_endereço;
    }
    public String getJG_endereço(){
    return this.JG_endereço;
    }
    public void setJG_Idade(int JG_Idade){
        this.JG_Idade=JG_Idade;
    }
    public int getJG_Idade(){
        return this.JG_Idade; 
    }
     public void setid(int id){
        this.id=id;
    }
    public int getid(){
    return this.id;
   
     

    
}}
    
    
    
