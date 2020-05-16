/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import DAO.JG_ClientesDAO;
import bean.JG_Clientess;
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
public class JG_Clientes extends JPanel implements ActionListener{
     JTextField JG_nome;
     JTextField JG_idade;
     JTextField JG_cpf;
     JTextField JG_cep;
     JTextField JG_endereço;
     JButton JG_botao;
 
    public JG_Clientes(){
        JLabel label = new  JLabel("Clientes");
        JLabel JGnome = new  JLabel("Nome");
        JLabel JGidade = new  JLabel("Idade");
        JLabel JGcpf = new  JLabel("CPF");
        JLabel JGcep = new  JLabel("CEP");
        JLabel JGendereço= new  JLabel("Endereço");
        
        
            JG_nome = new JTextField(20);
            JG_idade = new JTextField(20);
            JG_cpf = new JTextField(30);
            JG_cep = new JTextField(10);
            JG_endereço = new JTextField(15);
            
            

      
      JG_botao=new JButton("Salvar");
      JG_botao.addActionListener(this);
      
      add(JGnome);
      add(JG_nome);
      add(JGidade);
      add(JG_idade);
      add(JGcpf);
      add(JG_cpf);
      add(JGcep);
      add(JG_cep);
      add(JGendereço);
      add(JG_endereço);
      add(JG_botao);
      add(label);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
            String valor_JG_nome = JG_nome.getText();
            int valor_JG_CPF = Integer.parseInt(JG_cpf.getText());
            int valor_JG_Idade = Integer.parseInt(JG_idade.getText());
            int valor_JG_CEP = Integer.parseInt(JG_cep.getText());
            String valor_JG_Endereço = (String) JG_endereço.getText();
            
           
            
            JG_Clientess Cliente = new  JG_Clientess();
            Cliente.setJG_nome(valor_JG_nome);
            Cliente.setJG_cpf(valor_JG_CPF);
            Cliente.setJG_Idade(valor_JG_Idade);
            Cliente.setJG_cep(valor_JG_CEP);
            Cliente.setJG_endereço(valor_JG_Endereço);
            
            //String lm_texto = "Nome completo: "+Cliente.getJG_nome()+    
                  //  "\n Número de CPF: "+Cliente.getJG_cpf()+
                 //   "\n Idade: "+Cliente.getJG_Idade()+
                  //  "\n CEP: "+Cliente.getJG_cep()+
                 //   "\n Endereço: "+Cliente.getJG_endereço();
                    
          
           // JOptionPane.showMessageDialog(null, lm_texto); 
            JG_ClientesDAO.adicionar(Cliente);
            
          
           
            
    }
}



    

