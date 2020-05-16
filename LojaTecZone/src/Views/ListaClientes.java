/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;
import bean.JG_Clientess;
import DAO.JG_ClientesDAO;
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
public class ListaClientes extends JPanel  {
     private JButton botaoAdicionar, botaoEditar, botaoExcluir;
    
      private JTable tabela;
      private String[] colunas = {"id", "nome", "idade", "CPF", "CEP", "endereço"};
      private Object[][] dados;
      
      DefaultTableModel modelo = new DefaultTableModel(dados, colunas);
      
      public ListaClientes(){
          botaoAdicionar = new JButton("Adicionar");
          botaoEditar = new JButton("Editar");
          botaoExcluir = new JButton("Excluir");
          
          
          botaoAdicionar.addActionListener(new AdicionarListener());
          botaoEditar.addActionListener(new EditarListener());
          botaoExcluir.addActionListener(new ExcluirListener());
          
          tabela = new JTable(modelo);
          
          ArrayList<JG_Clientess> Clientes = JG_ClientesDAO.listar();
          
          for(JG_Clientess cliente: Clientes){
              String id = Integer.toString(cliente.getid());
              String nome = cliente.getJG_nome();
              String idade = Integer.toString(cliente.getJG_Idade());
              String CPF = Integer.toString(cliente.getJG_cpf());
              String CEP = Integer.toString(cliente.getJG_cep());
              String endereço = cliente.getJG_endereço();
              
              String[] linha = new String[]{id, nome, idade, CPF, CEP, endereço};
              
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
            centro.add(new JG_Clientes());   
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
