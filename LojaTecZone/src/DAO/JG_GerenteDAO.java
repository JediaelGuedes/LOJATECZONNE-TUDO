package DAO;


import bean.JG_Gerentee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class JG_GerenteDAO {
    
   

public static void adicionar(JG_Gerentee Gerente){
        
        String sql = "INSERT INTO produto (nome, usuário, senha, setor, salário) VALUES (?, ?, ?, ?, ?)";
        
        try{
            Connection conexao = ConexãoDB.retornaConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, Gerente.getJG_nome());
            stmt.setString(2, Gerente.getJG_usuário());
            stmt.setInt(3, Gerente.getJG_senha());
            stmt.setString(4, Gerente.getJG_setor());
            stmt.setDouble(5, Gerente.getJG_salário());
            stmt.execute();
        }catch(Exception e){

        }    
    }

   public static ArrayList<JG_Gerentee> listar(){
        
        ArrayList<JG_Gerentee> Gerentee = new ArrayList<>();
                
        String sql = "SELECT * FROM gerente";
        
        try{
            Connection conexao = ConexãoDB.retornaConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            ResultSet dados = stmt.executeQuery();
            
            while(dados.next()){
                JG_Gerentee temporario = new JG_Gerentee();
                temporario.setid(dados.getInt("id"));
                temporario.setJG_nome(dados.getString("nome"));
                temporario.setJG_usuário(dados.getString("usuário"));
                temporario.setJG_senha(dados.getInt("senha"));
                temporario.setJG_setor(dados.getString("setor"));
                temporario.setJG_salário(dados.getDouble("salário"));
                
                
                
   
               Gerentee.add(temporario);
            }
            
        }catch(Exception e){} 
        
        return Gerentee;
 }
     public static void excluir() { }

    public static void atualizar() { }
}

    





    


    

