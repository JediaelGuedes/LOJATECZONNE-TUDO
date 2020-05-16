/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import bean.JG_Clientess;
import DAO.JG_ClientesDAO;
import DAO.JG_ComprasDAO;
import DAO.JG_FuncionárioDAO;
import DAO.JG_GerenteDAO;
import DAO.JG_VendasDAO;
        
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import layout.JG_Centro;
import layout.JG_Direita;
import layout.JG_Esquerda;
import layout.JG_Rodapé;
import layout.JG_Topo;
import Views.JG_Clientes;


public class JG_LojaTecZone {
    public static JG_Centro centro = new JG_Centro();
    
    public static void main(String[] args){
        
        
        BorderLayout layout_janela = new BorderLayout();
        
        JFrame janela = new JFrame();
        janela.setLayout(layout_janela);
        janela.add(centro, BorderLayout.CENTER);
        janela.add(new JG_Topo(), BorderLayout.NORTH);
        janela.add(new JG_Rodapé(), BorderLayout.SOUTH);
        janela.add(new JG_Esquerda(), BorderLayout.EAST);
        janela.add(new JG_Direita(), BorderLayout.WEST);
        janela.pack();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}

