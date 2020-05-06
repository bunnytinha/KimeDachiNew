import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class AlterarAlunos extends JFrame implements ActionListener{
   private JButton botao1;
   private JButton botao2;
   private JLabel nomeA;
   private JTextField nome;
   private JLabel apelidoA;
   private JTextField apelido;
   private JLabel raA;
   private JTextField ra;
   private JLabel turmaA;
   private JTextField turma;
   public CadastroAlunos cadastroAlunos;
   
   public AlterarAlunos(){
      super("Kime Dachi - Alterar Cadastro");
      botao1 = new JButton("Alterar");
      botao2 = new JButton("Voltar");
      nomeA = new JLabel("Nome:");
      nome = new JTextField("");
      apelidoA = new JLabel("Apelido:");
      apelido = new JTextField("");
      raA = new JLabel("RA:");
      ra = new JTextField("");
      turmaA = new JLabel("Turma");
      turma = new JTextField("");
      //lista = new JTable(linhas,colunas);
      //lista1 = new JScrollPane(lista);
      
      Container caixa = getContentPane();
      
      caixa.setLayout(new FlowLayout());
      JPanel painel = new JPanel(new GridLayout(1,4));
      painel.add(nomeA);
      painel.add(nome);
      painel.add(apelidoA);
      painel.add(apelido);
      painel.add(raA);
      painel.add(ra);
      painel.add(turmaA);
      painel.add(turma);
      painel.add(botao1);
      painel.add(botao2);
      caixa.add(painel);

      botao1.addActionListener(this);
      botao2.addActionListener(this);
   
      setSize(700,200);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      this.setLocationRelativeTo(null);
      
   }
   
   public void actionPerformed(ActionEvent a){
      if(a.getSource() == botao1){
         System.out.println("Alterado");
         JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
      }
      if(a.getSource() == botao2){
         new TelaAluno();
         System.out.println("Voltar");
      }
   }
   
}