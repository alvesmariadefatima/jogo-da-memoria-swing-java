package regras;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;

public class ControleBotoesSelecionados {
    private String botao;
    private Map<JButton, EstadosBotoes> referenciasBotoes;

    public ControleBotoesSelecionados(){
        this.referenciasBotoes = new HashMap<>();
    }

    public String getBotao(){
        return botao;
    }

    public void setBotao(String botao){
        this.botao = botao;
    }

    public Map<JButton, EstadosBotoes> getReferenciasBotoes(){
        return referenciasBotoes;
    }

    public void setReferenciasBotoes(Map<JButton, EstadosBotoes> referenciasBotoes){
        this.referenciasBotoes = referenciasBotoes;
    }

    public void adicionarBotao(JButton botao){
        this.referenciasBotoes.put(botao, EstadosBotoes.NORMAL);
    }

    public void alterarSelecao(JButton botao, EstadosBotoes selecionado) {
        EstadosBotoes n = this.referenciasBotoes.get(botao);
        EstadosBotoes b = selecionado;
        alterarVisualizacaoBotao(botao);
    }

    private void alterarVisualizacaoBotao(JButton botao){
        EstadosBotoes selecionado = this.referenciasBotoes.get(botao);
        switch (selecionado){
            case NORMAL: // Cinza, não exibe texto
                botao.setBackground(null);
                botao.setText("Jogo");
                break;
            case SELECIONADO: // Exibir texto, mudar a cor
                botao.setBackground(Color.pink);
                botao.setText(this.botao);
                break;
            case PARES_ENCONTRADOS: // Mudar a cor, exibir o texto
                botao.setBackground(Color.MAGENTA);
                botao.setText(this.botao);
                break;
        }
    }
    public void zerarSelecoes(){
        this.referenciasBotoes.values().stream().forEach((b) -> {
            b = EstadosBotoes.NORMAL;
        });
    }
    public Boolean isTodasSelecionadas(){
        for(EstadosBotoes b : this.referenciasBotoes.values()){
            if(b != EstadosBotoes.SELECIONADO){
                return false;
            }
        }
        return true;
    }
}
