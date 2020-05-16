package DAO;

import bean.JG_Clientess;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class JG_ClientesDAO {
    
   

public static void adicionar(JG_Clientess clientes){
        
        String sql = "INSERT INTO produto (nome, idade, CPF, CEP, endereço) VALUES (?, ?, ?, ?, ?)";
        
        try{
            Connection conexao = ConexãoDB.retornaConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, clientes.getJG_nome());
            stmt.setInt(2, clientes.getJG_Idade());
            stmt.setInt(3, clientes.getJG_cpf());
            stmt.setInt(4, clientes.getJG_cep());
            stmt.setString(5, clientes.getJG_endereço());
            stmt.execute();
        }catch(Exception e){

        }    
        
    }

 public static ArrayList<JG_Clientess> listar(){
        
        ArrayList<JG_Clientess> Clientes = new ArrayList<>();
                
        String sql = "SELECT * FROM clientes";
        
        try{
            Connection conexao = ConexãoDB.retornaConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            ResultSet dados = stmt.executeQuery();
            
            while(dados.next()){
                JG_Clientess temporario = new JG_Clientess();
                temporario.setid(dados.getInt("id"));
                temporario.setJG_nome(dados.getString("nome"));
                temporario.setJG_Idade(dados.getInt("idade"));
                temporario.setJG_cpf(dados.getInt("CPF"));
                temporario.setJG_cep(dados.getInt("CEP"));
                temporario.setJG_nome(dados.getString("endereço"));
                Clientes.add(temporario);
            }
            
        }catch(Exception e){} 
        
        return Clientes;
 }
     public static void excluir() { }

    public static void atualizar() { }
}

    
