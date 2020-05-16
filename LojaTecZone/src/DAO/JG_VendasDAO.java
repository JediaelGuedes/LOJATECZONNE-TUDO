package DAO;


import bean.JG_Vendass;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class JG_VendasDAO {
    
   

public static void adicionar(JG_Vendass Vendas){
        
        String sql = "INSERT INTO produto (MÊS, vendas_realizadas, vendas_não_realizadas, prejuízo, lucro) VALUES (?, ?, ?, ?, ?)";
        
        try{
            Connection conexao = ConexãoDB.retornaConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, Vendas.getJG_Mês());
            stmt.setInt(2, Vendas.getJG_VendasRealizadas());
            stmt.setInt(3, Vendas.getJG_VendasNãoRealizadas());
            stmt.setDouble(4, Vendas.getJG_Prejuízo());
            stmt.setDouble(5, Vendas.getJG_Lucro());
            stmt.execute();
        }catch(Exception e){

        }    
    }


 public static ArrayList<JG_Vendass> listar(){
        
        ArrayList<JG_Vendass> Vendass = new ArrayList<>();
                
        String sql = "SELECT * FROM vendas";
        
        try{
            Connection conexao = ConexãoDB.retornaConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            ResultSet dados = stmt.executeQuery();
            
            while(dados.next()){
                JG_Vendass temporario = new JG_Vendass();
                temporario.setid(dados.getInt("id"));
                temporario.setJG_Mês(dados.getString("MÊS"));
                temporario.setJG_VendasRealizadas(dados.getInt("vendas_realizadas"));
                temporario.setJG_VendasNãoRealizadas(dados.getInt("vendas_não_realizadas"));
                temporario.setJG_Prejuízo(dados.getDouble("prejuízo"));
                temporario.setJG_Lucro(dados.getDouble("lucro"));
                
               
               
                
                
   
                Vendass.add(temporario);
            }
            
        }catch(Exception e){} 
        
        return  Vendass;
 }
     public static void excluir() { }

    public static void atualizar() { }
}

    





    


    

