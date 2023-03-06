package telas;

import javax.swing.JFrame;

public class TelaPrincipal extends JFrame {

    private JButton botao1;
    private JButton botao2;
  
    public TelaPrincipal(){
      super("Jogo da Memória");

      botao1 = new JButton('Botao1');
      this.add(botao1);
      botao1.setBounds(10, 10, 100, 100);
      
      this.setBounds(250, 100, 350, 350);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setVisible(true);
    }

  
}