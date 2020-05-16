/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;
import bean.JG_Comprass;
import DAO.JG_ComprasDAO;
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
public class ListaCompras extends JPanel {
    private JButton botaoAdicionar, botaoEditar, botaoExcluir;
    
      private JTable tabela;
      private String[] colunas = {"id", "produto", "armazenadas", "perdidas", "avarias", "código"};
      private Object[][] dados;
      
      DefaultTableModel modelo = new DefaultTableModel(dados, colunas);
      
      public ListaCompras(){
          botaoAdicionar = new JButton("Adicionar");
          botaoEditar = new JButton("Editar");
          botaoExcluir = new JButton("Excluir");
          
          
          botaoAdicionar.addActionListener(new AdicionarListener());
          botaoEditar.addActionListener(new EditarListener());
          botaoExcluir.addActionListener(new ExcluirListener());
          
          tabela = new JTable(modelo);
          
          ArrayList<JG_Comprass> Compras = JG_ComprasDAO.listar();
          
          for(JG_Comprass Compra: Compras){
              String id = Integer.toString(Compra.getid());
              String produto = Compra.getJG_produto();
              String armazenadas = Integer.toString(Compra.getJG_armazenadas());
              String perdidas = Integer.toString(Compra.getJG_perdidas());
              String avarias = Integer.toString(Compra.getJG_avarias());
              String código = Integer.toString(Compra.getJG_código());
              
              
              String[] linha = new String[]{id, produto, armazenadas, perdidas, avarias, código};
              
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
            centro.add(new JG_Compras());   
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
