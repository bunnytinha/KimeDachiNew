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

public class TelaAluno extends JFrame implements ActionListener{
   private JButton botao1;
   private JButton botao2;
   private JButton botao3;
   private JButton botao4;
   public TelaAluno telaluno;
   
   
   public TelaAluno(){
      super("Kime Dachi - Alunos");
      botao1 = new JButton("Lista de Alunos");
      botao2 = new JButton("Cadastrar Alunos");
      botao3 = new JButton("Alterar Cadastro");
      botao4 = new JButton("Voltar");
      
      
      Container caixa = getContentPane();
      
      caixa.setLayout(new FlowLayout());
      JPanel painel = new JPanel(new GridLayout(1,4));
      painel.add(botao1);
      painel.add(botao2);
      painel.add(botao3);
      painel.add(botao4);
      caixa.add(painel);

      botao1.addActionListener(this);
      botao2.addActionListener(this);
      botao3.addActionListener(this);
      botao4.addActionListener(this);
   
      setSize(700,200);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      this.setLocationRelativeTo(null);
      
   }
   
   public void actionPerformed(ActionEvent a){
      if(a.getSource() == botao1){
         new ListaAlunos();
         System.out.println("Lista de Alunos");
      }
      if(a.getSource() == botao2){
         new CadastroAlunos();
         System.out.println("Cadastro de Alunos");
      }
      if(a.getSource() == botao3){
         new AlterarAlunos();
         System.out.println("Alterar Cadastro");
      }
      if(a.getSource() == botao4){
         new TelaMenu();
         System.out.println("Menu");
      }
   }
}