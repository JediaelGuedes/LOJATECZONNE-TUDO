/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;
import bean.JG_Vendass;
import DAO.JG_VendasDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static principal.JG_LojaTecZone.centro;

/**
 *
 * @author USER
 */
public class ListaVendas extends JPanel {
    private JButton botaoAdicionar, botaoEditar, botaoExcluir;
    
      private JTable tabela;
      private String[] colunas = {"id", "MÊS", "vendas_realizadas", "vendas_não_realizadas", "prejuízo", "lucro"};
      private Object[][] dados;
      
      DefaultTableModel modelo = new DefaultTableModel(dados, colunas);
      
      public ListaVendas(){
          botaoAdicionar = new JButton("Adicionar");
          botaoEditar = new JButton("Editar");
          botaoExcluir = new JButton("Excluir");
          
          
          botaoAdicionar.addActionListener(new AdicionarListener());
          botaoEditar.addActionListener(new EditarListener());
          botaoExcluir.addActionListener(new ExcluirListener());
          
          tabela = new JTable(modelo);
          
          ArrayList<JG_Vendass> Vendas = JG_VendasDAO.listar();
          
          for(JG_Vendass Venda: Vendas){
              String id = Integer.toString(Venda.getid());
              String MÊS = Venda.getJG_Mês();
              String vendas_realizadas = Integer.toString(Venda.getJG_VendasRealizadas());
              String vendas_não_realizadas = Integer.toString(Venda.getJG_VendasNãoRealizadas());
              String prejuízo = Double.toString(Venda.getJG_Prejuízo());
              String lucro = Double.toString(Venda.getJG_Lucro());
            
              
              
             
              
              String[] linha = new String[]{id, MÊS,  vendas_realizadas, vendas_não_realizadas, prejuízo, lucro};
              
              modelo.addRow(linha);              
          }
          
          add(tabela);
          
          add(botaoAdicionar);
          add(botaoEditar);
          add(botaoExcluir);
      }

    private static class AdicionarListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            centro.removeAll();
            centro.add(new JG_Vendas());   
            centro.repaint();                 
            centro.validate();
        }
    }

    private static class EditarListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {}
    }

    private static class ExcluirListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {}
    }
    
    
    
}
