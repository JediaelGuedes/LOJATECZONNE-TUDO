/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;
import bean.JG_Funcionários;
import DAO.JG_FuncionárioDAO;
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
    public class ListaFuncionário extends JPanel {
    private JButton botaoAdicionar, botaoEditar, botaoExcluir;
    
      private JTable tabela;
      private String[] colunas = {"id", "nome", "meses_trabalhados", "horas_trabalhadas", "horas_extras", "custo_hora"};
      private Object[][] dados;
      
      DefaultTableModel modelo = new DefaultTableModel(dados, colunas);
      
      public ListaFuncionário(){
          botaoAdicionar = new JButton("Adicionar");
          botaoEditar = new JButton("Editar");
          botaoExcluir = new JButton("Excluir");
          
          
          botaoAdicionar.addActionListener(new AdicionarListener());
          botaoEditar.addActionListener(new EditarListener());
          botaoExcluir.addActionListener(new ExcluirListener());
          
          tabela = new JTable(modelo);
          
          ArrayList<JG_Funcionários> funcionários = JG_FuncionárioDAO.listar();
          
          for(JG_Funcionários funcionário: funcionários){
              String id = Integer.toString(funcionário.getid());
              String nome = funcionário.getJG_nome();
              String meses_trabalhados = Integer.toString(funcionário.getJG_MesesTrabalhados());
              String horas_trabalhadas = Integer.toString(funcionário.getJG_HorasTrabalhadas());
              String horas_extras = Integer.toString(funcionário.getJG_HorasExtras());
              String custo_hora = Double.toString(funcionário.getJG_CustoHora());
              
              
             //temporario.setPreco(dados.getDouble("preco"));
             
              
              String[] linha = new String[]{id, nome, meses_trabalhados, horas_trabalhadas, horas_extras, custo_hora};
              
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
            centro.add(new JG_Funcionário());   
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
