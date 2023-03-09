package regras;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;;

public class ControleBotoesSelecionados {
    private String botao;
    private Map<JButton, Boolean> referenciasBotoes;

    public ControleBotoesSelecionados(){
        this.referenciasBotoes = new HashMap<>();
    }

    public String getBotao(){
        return botao;
    }

    public void setBotao(String botao){
        this.botao = botao;
    }

    public Map<JButton, Boolean> getReferenciasBotoes(){
        return referenciasBotoes;
    }

    public void setReferenciasBotoes(Map<JButton, Boolean> referenciasBotoes){
        this.referenciasBotoes = referenciasBotoes;
    }

    public void adicionarBotao(JButton botao){
        this.referenciasBotoes.put(botao, Boolean.FALSE);
    }

    public void alterarSelecao(Object source, boolean rootPaneCheckingEnabled) {
    
    }
}
