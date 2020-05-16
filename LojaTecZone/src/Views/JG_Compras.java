/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;
import DAO.JG_ComprasDAO;
import bean.JG_Comprass;
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
public class JG_Compras extends JPanel implements ActionListener {
    JTextField JG_produto;
    JTextField JG_armazenadas;
    JTextField  JG_perdidas;
    JTextField JG_avarias;
    JTextField JG_código;
    JButton JG_botao;
 
    public JG_Compras(){
        JLabel label = new  JLabel("Compras");
        JLabel JGProduto = new  JLabel("Produto");
        JLabel JGArmazenados = new  JLabel("Produtos Armazenados");
        JLabel JGPerdidos = new  JLabel("Produtos Perdidos");
        JLabel JGAvarias = new  JLabel("Total de Avarias");
        JLabel JGCódigo= new  JLabel("Código do Produto");
        
        
            JG_produto = new JTextField(15);
            JG_armazenadas = new JTextField(15);
            JG_perdidas = new JTextField(15);
            JG_avarias = new JTextField(10);
            JG_código = new JTextField(15);
            
      
      JG_botao=new JButton("Salvar");
      JG_botao.addActionListener(this);
      
      add(JGProduto);
      add(JG_produto);
      add(JGArmazenados);
      add(JG_armazenadas);
      add(JGPerdidos);
      add(JG_perdidas);
      add(JGAvarias);
      add(JG_avarias);
      add(JGCódigo);
      add(JG_código);
      add(JG_botao);
      add(label);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
            String valor_JG_produto = JG_produto.getText();
            int valor_JG_armazenadas = Integer.parseInt(JG_armazenadas.getText());
            int valor_JG_perdidas = Integer.parseInt(JG_perdidas.getText());
            int valor_JG_avarias = Integer.parseInt(JG_avarias.getText());
            int valor_JG_código = Integer.parseInt(JG_código.getText());
            
            
            
            JG_Comprass Compras = new  JG_Comprass();
             Compras.setJG_produto( valor_JG_produto);
             Compras.setJG_armazenadas(valor_JG_armazenadas);
             Compras.setJG_perdidas(valor_JG_perdidas);
             Compras.setJG_avarias(valor_JG_avarias);
             Compras.setJG_código(valor_JG_código);
            
            //String Mensagem = "Nome do Produto: "+Compras.getJG_produto()+    
                  //  "\n Número de Produtos Armazenados: "+Compras.getJG_armazenadas()+
                 //   "\n Número de produtos Perdidos: "+Compras.getJG_perdidas()+
                  //  "\n Número de Avarias: "+Compras.getJG_avarias()+
                 //   "\n Código do Produto: "+Compras.getJG_código();
                    
            
            //JOptionPane.showMessageDialog(null, Mensagem); 
            JG_ComprasDAO.adicionar(Compras);
          
           
            
    }
    
    
    
    
    
    
    
    
}
