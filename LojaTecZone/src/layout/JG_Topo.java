/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout;

import static principal.JG_LojaTecZone.centro;
//============================
import Views.JG_Clientes;
import Views.ListaClientes;
//============================
import Views.JG_Compras;
import Views.ListaCompras;
//============================
import Views.JG_Funcionário;
import Views.ListaFuncionário;
//=============================
import Views.JG_Gerente;
import Views.ListaGerente;
//===========================
import Views.JG_Vendas;
import Views.ListaVendas;

//============================
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *

 */
public class JG_Topo extends JPanel{
    private JButton botao1;
    private JButton botao2;
    private JButton botao3;
    private JButton botao4;
    private JButton botao5;
    
     public JG_Topo(){
        GridLayout layoutTopo = new GridLayout();        
        setLayout(layoutTopo);
        botao1 = new JButton("CLIENTES");
        botao1.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    centro.removeAll();
                    centro.add(new ListaClientes());   
                    centro.repaint();                 
                    centro.validate();
                }
            });
        
        botao2 = new JButton("FUNCIONÁRIO");
        botao2.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    centro.removeAll();
                    centro.add(new ListaFuncionário());   
                    centro.repaint();                 
                    centro.validate();
                }
            });
        
        botao3 = new JButton("GERENTE");
        botao3.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    centro.removeAll();
                    centro.add(new ListaGerente());   
                    centro.repaint();                 
                    centro.validate();
                }
            });
        
        botao4 = new JButton("COMPRAS");
        botao4.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    centro.removeAll();
                    centro.add(new ListaCompras());   
                    centro.repaint();                 
                    centro.validate();
                }
            });
        
        botao5 = new JButton("VENDAS");
        botao5.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    centro.removeAll();
                    centro.add(new ListaVendas());   
                    centro.repaint();                 
                    centro.validate();
                }
            });
        
        add(botao1);
        add(botao2);
        add(botao3);
        add(botao4);
        add(botao5);
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    