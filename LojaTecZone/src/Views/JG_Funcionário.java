/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;
import DAO.JG_FuncionárioDAO;
import bean.JG_Funcionários;
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
public class JG_Funcionário extends JPanel implements ActionListener{
     JTextField JG_nome;
     JTextField JG_MesesTrabalhados;
     JTextField JG_HorasTrabalhadas;
     JTextField JG_HorasExtras;
     JTextField JG_CustoHora;
     JButton JG_botao;
 
    public JG_Funcionário(){
        JLabel label = new  JLabel("Funcionário");
        JLabel JGNome = new  JLabel("Nome");
        JLabel JGMesesTrabalhados = new  JLabel("MesesTrabalhados");
        JLabel JGHorasTrabalhadas = new  JLabel("HorasTrabalhadas");
        JLabel JGHorasExtras = new  JLabel("HorasExtras");
        JLabel JGCustoHora= new JLabel("CustoHora");
        
        
            JG_nome = new JTextField(15);
            JG_MesesTrabalhados = new JTextField(10);
            JG_HorasTrabalhadas= new JTextField(10);
            JG_HorasExtras = new JTextField(20);
            JG_CustoHora = new JTextField(20);
            
            
        

      
      JG_botao=new JButton("Salvar");
      JG_botao.addActionListener(this);
      
      add(JGNome);
      add(JG_nome);
      add(JGMesesTrabalhados);
      add(JG_MesesTrabalhados);
      add(JGHorasTrabalhadas);
      add(JG_HorasTrabalhadas);
      add(JGHorasExtras);
      add(JG_HorasExtras);
      add(JGCustoHora);
      add(JG_CustoHora);
      add(JG_botao);
      add(label);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
            String valor_JG_nome = JG_nome.getText();
            int valor_JG_MesesTrabalhados = Integer.parseInt(JG_MesesTrabalhados.getText());
            int valor_JG_HorasTrabalhadas = Integer.parseInt(JG_HorasTrabalhadas.getText());
            int valor_JG_HorasExtras = Integer.parseInt(JG_HorasExtras.getText());
            double valor_JG_CustoHora = Double.parseDouble(JG_CustoHora.getText());
            
           
            
            
            JG_Funcionários Funcionário = new JG_Funcionários();
             Funcionário.setJG_nome( valor_JG_nome);
             Funcionário.setJG_MesesTrabalhados(valor_JG_MesesTrabalhados);
             Funcionário.setJG_HorasTrabalhadas(valor_JG_HorasTrabalhadas);
             Funcionário.setJG_HorasExtras(valor_JG_HorasExtras);
             Funcionário.setJG_CustoHora(valor_JG_CustoHora);
            //String lm_texto = "Nome completo: "+Funcionário.getJG_nome()+    
                   // "\n Meses Trabalhados: "+Funcionário.getJG_MesesTrabalhados()+
                   // "\n Horas Trabalhadas: "+Funcionário.getJG_HorasTrabalhadas()+
                   // "\n Horas Extras: "+Funcionário.getJG_HorasExtras ()+
                  //  "\n Custo Hora: "+Funcionário.getJG_CustoHora();
                    
            
          //  JOptionPane.showMessageDialog(null, lm_texto); 
            
           JG_FuncionárioDAO.adicionar(Funcionário);
           
            
    }
}



    

