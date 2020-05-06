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

public class Aulas extends JFrame implements ActionListener{
   private JButton botao1;
   
   public Aulas(){
      super("Kime Dachi - Aulas");
      botao1 = new JButton("Voltar");
      
      
      Container caixa = getContentPane();
      
      caixa.setLayout(new FlowLayout());
      JPanel painel = new JPanel(new GridLayout(1,4));
      painel.add(botao1);
      caixa.add(painel);

      botao1.addActionListener(this);
   
      setSize(700,200);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      this.setLocationRelativeTo(null);
      
   }
   
   public void actionPerformed(ActionEvent a){
      if(a.getSource() == botao1){
         new TelaPerguntas();
         System.out.println("Menu");
      }
   }
}