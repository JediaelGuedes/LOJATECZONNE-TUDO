/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;
import DAO.JG_GerenteDAO;
import bean.JG_Gerentee;
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
    public class JG_Gerente extends JPanel implements ActionListener{
     JTextField JG_nome;
     JTextField JG_usuário;
     JTextField JG_senha;
     JTextField JG_setor;
     JTextField JG_salário;
     JButton JG_botao;
 
    public JG_Gerente(){
        JLabel label = new  JLabel("Gerente");
        JLabel JGnome = new  JLabel("Nome");
        JLabel JGusuário = new  JLabel("Usuário");
        JLabel JGsenha = new  JLabel("Senha");
        JLabel JGsetor = new  JLabel("Setor");
        JLabel JGsalário= new  JLabel("Salário");
        
        
            JG_nome = new JTextField(22);
            JG_usuário = new JTextField(15);
            JG_senha = new JTextField(10);
            JG_setor = new JTextField(27);
            JG_salário = new JTextField(19);
            
            
        

      
      JG_botao=new JButton("Salvar");
      JG_botao.addActionListener(this);
      
      add(JGnome);
      add(JG_nome);
      add(JGusuário);
      add(JG_usuário);
      add(JGsenha);
      add(JG_senha);
      add(JGsetor);
      add(JG_setor);
      add(JGsalário);
      add(JG_salário);
      add(JG_botao);
      add(label);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
            String valor_JG_nome = JG_nome.getText();
            String valor_JG_usuário = (String) JG_usuário.getText();
            int valor_JG_senha = Integer.parseInt(JG_senha.getText());
            String valor_JG_setor = (String) JG_setor.getText();
            double valor_JG_salário = Double.parseDouble(JG_salário.getText());
            
            
            
            
            JG_Gerentee Gerente = new JG_Gerentee();
             Gerente.setJG_nome( valor_JG_nome);
             Gerente.setJG_usuário(valor_JG_usuário);
             Gerente.setJG_senha(valor_JG_senha);
             Gerente.setJG_setor(valor_JG_setor);
             Gerente.setJG_salário(valor_JG_salário);
            
            //String lm_texto = "Nome completo: "+Gerente.getJG_nome()+    
                    //"\n Usuário: "+Gerente.getJG_usuário()+
                    //"\n Senha: "+Gerente.getJG_senha()+
                    //"\n Setor: "+Gerente.getJG_setor()+
                   // "\n salário: "+Gerente.getJG_salário();
                    
            
           // JOptionPane.showMessageDialog(null, lm_texto); 
            
            JG_GerenteDAO.adicionar(Gerente);
           
            
    }
}



    


    
    
    
    
    
    
    
    
    
    
    
    

