package telas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class TelaPrincipal extends JFrame {
    private JPanel painel;
    private JButton botao1;
    private JButton botao2;
    private ControleBotoesSelecionados controle;

    public TelaPrincipal(){
        super("Jogo da Memória");

        controle = new ControleBotoesSelecionados();

        painel = new JPanel();
        this.add(painel);
        painel.setLayout(null);

        botao1 = new JButton("Açaí");
        painel.add(botao1);
        botao1.setBounds(10, 10, 100, 100);

        botao1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //((JButton) e.getSource()).setBackground(Color.pink);
                controle.setBotao("Jogo");
                controle.alterarSelecao((JButton) e.getSource(), EstadosBotoes.SELECIONADO);
                //((JButton) e.getSource()).setText(controle.getBotao());
            }
        });

        botao2 = new JButton("Coxinha");
        painel.add(botao2);
        botao2.setBounds(120, 10, 100, 100);
        this.setBounds(250, 100, 350, 350);

        this.controle.adicionarBotao(botao1);
        this.controle.adicionarBotao(botao2);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }


}
