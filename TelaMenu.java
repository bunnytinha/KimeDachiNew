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
import java.awt.*;  
import javax.swing.*;

public class TelaMenu extends JFrame implements ActionListener{
   private JButton botao1;
   private JButton botao2;
   private JButton botao3;
   public TelaMenu telaMenu;
   
   public TelaMenu(){
      super("Kime Dachi - Menu");
      botao1 = new JButton("Alunos");
      botao2 = new JButton("Perguntas");
      botao3 = new JButton("Dojo");

      Container caixa = getContentPane();
      
      caixa.setLayout(new FlowLayout());
      //caixa.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
      JPanel painel = new JPanel(new GridLayout(1,3));
      //JPanel painel = new JPanel();
      painel.add(botao1);
      painel.add(botao2);
      painel.add(botao3);
      caixa.add(painel);
        
      botao1.addActionListener(this);
      botao2.addActionListener(this);
      botao3.addActionListener(this);
   
      setSize(700,200);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      this.setLocationRelativeTo(null);
      
   }
   
   public void actionPerformed(ActionEvent a){
      if(a.getSource() == botao1){
         new TelaAluno();
         System.out.println("Alunos");
      }
      if(a.getSource() == botao2){
         new TelaPerguntas();
         System.out.println("Perguntas");
      }
      if(a.getSource() == botao3){
         new TelaDojo();
         System.out.println("Dojo");
      }
   }
   
}
