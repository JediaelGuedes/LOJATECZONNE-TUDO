package DAO;


import bean.JG_Funcionários;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class JG_FuncionárioDAO {
    
   

public static void adicionar(JG_Funcionários Funcionário){
        
        String sql = "INSERT INTO produto (nome, meses_trabalhados, horas_trabalhadas, horas_extras, custo_hora) VALUES (?, ?, ?, ?, ?)";
        
        try{
            Connection conexao = ConexãoDB.retornaConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, Funcionário.getJG_nome());
            stmt.setInt(2, Funcionário.getJG_MesesTrabalhados());
            stmt.setInt(3, Funcionário.getJG_HorasTrabalhadas());
            stmt.setInt(4, Funcionário.getJG_HorasExtras());
            stmt.setDouble(5, Funcionário.getJG_CustoHora());
            stmt.execute();
        }catch(Exception e){

        }    
    }

   public static ArrayList<JG_Funcionários> listar(){
        
        ArrayList<JG_Funcionários> Funcionários = new ArrayList<>();
                
        String sql = "SELECT * FROM funcionário";
        
        try{
            Connection conexao = ConexãoDB.retornaConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            ResultSet dados = stmt.executeQuery();
            
            while(dados.next()){
                JG_Funcionários temporario = new JG_Funcionários();
                temporario.setid(dados.getInt("id"));
                temporario.setJG_nome(dados.getString("nome"));
                temporario.setJG_MesesTrabalhados(dados.getInt("meses_trabalhados"));
                temporario.setJG_HorasTrabalhadas(dados.getInt("horas_trabalhadas"));
                temporario.setJG_HorasExtras(dados.getInt("horas_extras"));
                 temporario.setJG_CustoHora(dados.getDouble("custo_hora"));
                
                
   
               Funcionários.add(temporario);
            }
            
        }catch(Exception e){} 
        
        return Funcionários;
 }
     public static void excluir() { }

    public static void atualizar() { }
}

    





    


    
