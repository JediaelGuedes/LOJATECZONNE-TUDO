/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;
import DAO.JG_VendasDAO;
import bean.JG_Vendass;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author USER
 */
public class JG_Vendas extends JPanel implements ActionListener {
     JTextField JG_Mês;
     JTextField JG_VendasRealizadas;
     JTextField JG_VendasNãoRealizadas;
     JTextField JG_Prejuízo;
     JTextField JG_Lucro;
     JButton JG_botao;
 
    public JG_Vendas(){
        JLabel label = new  JLabel("Vendas");
        JLabel JGMês = new  JLabel("Mês");
        JLabel JGVendasRealizadas = new  JLabel("Vendas Realizadas");
        JLabel JGVendasNãoRealizadas = new  JLabel("Vendas Não Realizadas");
        JLabel JGPrejuízo = new  JLabel("Prejuízo");
        JLabel JGLucro= new JLabel("Lucro");
        
        
            JG_Mês = new JTextField(15);
            JG_VendasRealizadas = new JTextField(15);
            JG_VendasNãoRealizadas = new JTextField(15);
            JG_Prejuízo = new JTextField(15);
            JG_Lucro = new JTextField(15);
            
          

      
      JG_botao=new JButton("Salvar");
      JG_botao.addActionListener(this);
      
      add(JGMês);
      add(JG_Mês);
      add(JGVendasRealizadas);
      add(JG_VendasRealizadas);
      add(JGVendasNãoRealizadas);
      add(JG_VendasNãoRealizadas);
      add(JGPrejuízo);
      add(JG_Prejuízo);
      add(JGLucro);
      add(JG_Lucro);
      add(JG_botao);
      add(label);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
            String valor_JG_Mês = JG_Mês.getText();
            int valor_JG_VendasRealizadas = Integer.parseInt(JG_VendasRealizadas.getText());
            int valor_JG_VendasNãoRealizadas = Integer.parseInt(JG_VendasNãoRealizadas.getText());
            double valor_JG_Prejuízo = Double.parseDouble(JG_Prejuízo.getText());
            double valor_JG_Lucro = Double.parseDouble(JG_Lucro.getText());
         
            
           JG_Vendass Vendas = new JG_Vendass();
             Vendas.setJG_Mês( valor_JG_Mês);
             Vendas.setJG_VendasRealizadas(valor_JG_VendasRealizadas);
             Vendas.setJG_VendasNãoRealizadas (valor_JG_VendasNãoRealizadas);
             Vendas.setJG_Prejuízo(valor_JG_Prejuízo);
             Vendas.setJG_Lucro(valor_JG_Lucro);
            
           // String lm_texto = "MÊS: "+ Vendas.getJG_Mês()+    
                   // "\n Número de Vendas realizadas eh: "+ Vendas.getJG_VendasRealizadas()+
                   // "\n Número de Vendas não realizadas eh: "+ Vendas.getJG_VendasNãoRealizadas()+
                   // "\n O prejuízo total eh: "+ Vendas.getJG_Prejuízo()+
                   // "\n O Lucro total eh: "+ Vendas.getJG_Lucro();
                    
            
            //JOptionPane.showMessageDialog(null, lm_texto); 
            
              JG_VendasDAO.adicionar(Vendas);
           
            
    }
    
    
}
