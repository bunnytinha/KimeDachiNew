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

public class CadastroPerguntas extends JFrame implements ActionListener{
   private JButton botao1;
   private JButton botao2;
   private JLabel pergunta;
   private JTextField pergunta1;
   private JLabel resposta;
   private JTextField resposta1;
   private JButton botao4;
   public CadastroPerguntas cadastroPerguntas;
   
   
   public CadastroPerguntas(){
      super("Kime Dachi - Cadastro de Perguntas");
      botao1 = new JButton("Cadastrar");
      botao2 = new JButton("Voltar");
      pergunta = new JLabel("Pergunta");
      pergunta1 = new JTextField("");
      resposta = new JLabel("Resposta");
      resposta1 = new JTextField("");
      
      
      Container caixa = getContentPane();
      
      caixa.setLayout(new FlowLayout());
      JPanel painel = new JPanel(new GridLayout(1,4));

      painel.add(pergunta);
      painel.add(pergunta1);
      painel.add(resposta);
      painel.add(resposta1);
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
         JOptionPane.showMessageDialog(null,"Pergunta cadastrada!");
         System.out.println("Pergunta cadastrada.");
      }
      if(a.getSource() == botao2){
         new TelaPerguntas();
         System.out.println("Tela Perguntas");
      }
   }
   
}