/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;
import bean.JG_Gerentee;
import DAO.JG_GerenteDAO;
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
public class ListaGerente extends JPanel {
    private JButton botaoAdicionar, botaoEditar, botaoExcluir;
    
      private JTable tabela;
      private String[] colunas = {"id", "nome", "usuário", "senha", "setor", "salário"};
      private Object[][] dados;
      
      DefaultTableModel modelo = new DefaultTableModel(dados, colunas);
      
      public ListaGerente(){
          botaoAdicionar = new JButton("Adicionar");
          botaoEditar = new JButton("Editar");
          botaoExcluir = new JButton("Excluir");
          
          
          botaoAdicionar.addActionListener(new AdicionarListener());
          botaoEditar.addActionListener(new EditarListener());
          botaoExcluir.addActionListener(new ExcluirListener());
          
          tabela = new JTable(modelo);
          
          ArrayList<JG_Gerentee> Gerentee = JG_GerenteDAO.listar();
          
          for(JG_Gerentee Gerente: Gerentee){
              String id = Integer.toString(Gerente.getid());
              String nome = Gerente.getJG_nome();
              String usuário = Gerente.getJG_usuário();
              String senha = Integer.toString(Gerente.getJG_senha());
              String setor = Gerente.getJG_setor();
              String salário = Double.toString(Gerente.getJG_salário());
              
              
              
             //temporario.setPreco(dados.getDouble("preco"));
             
              
              String[] linha = new String[]{id, nome,  usuário, senha, setor, salário};
              
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
            centro.add(new JG_Gerente());   
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
