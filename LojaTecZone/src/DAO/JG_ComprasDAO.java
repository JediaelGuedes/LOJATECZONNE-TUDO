package DAO;

import bean.JG_Comprass;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class JG_ComprasDAO {
    
   

public static void adicionar(JG_Comprass compras){
        
        String sql = "INSERT INTO produto (produto, armazenadas, perdidas, avarias, código) VALUES (?, ?, ?, ?, ?)";
        
        try{
            Connection conexao = ConexãoDB.retornaConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, compras.getJG_produto());
            stmt.setInt(2, compras.getJG_armazenadas());
            stmt.setInt(3, compras.getJG_perdidas());
            stmt.setInt(4, compras.getJG_avarias());
            stmt.setInt(5, compras.getJG_código());
            stmt.execute();
        }catch(Exception e){

        }    
    }
public static ArrayList<JG_Comprass> listar(){
        
        ArrayList<JG_Comprass> compras = new ArrayList<>();
                
        String sql = "SELECT * FROM compras";
        
        try{
            Connection conexao = ConexãoDB.retornaConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            ResultSet dados = stmt.executeQuery();
            
            while(dados.next()){
                JG_Comprass temporario = new JG_Comprass();
                
                 temporario.setid(dados.getInt("id"));
                temporario.setJG_produto(dados.getString("produto"));
                temporario.setJG_armazenadas(dados.getInt("armazenadas"));
                temporario.setJG_perdidas(dados.getInt("perdidas"));
                temporario.setJG_avarias(dados.getInt("avarias"));
                temporario.setJG_avarias(dados.getInt("código"));
                
                
   
                compras.add(temporario);
            }
            
        }catch(Exception e){} 
        
        return compras;
 }
     public static void excluir() { }

    public static void atualizar() { }
}

    





    


    
