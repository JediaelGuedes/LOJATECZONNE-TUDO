package DAO;

import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;

public class ConexãoDB {
    private static final String USUARIO = "root"; 
    private static final String SENHA = "00000000";
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/jg_lojatecnologia?useTimezone=true&serverTimezone=UTC";
    
    public static Connection retornaConexao(){
        Connection conexao = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(URL, USUARIO, SENHA );            
        }catch(SQLException e){
            System.err.println("Erro de Conexao:" + e.toString());
        } catch (ClassNotFoundException e) {            
            System.err.println("Classe Não Encontrada:" + e.toString());
        }
        
        return conexao;
    }}
    

