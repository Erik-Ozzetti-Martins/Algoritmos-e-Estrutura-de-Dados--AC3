package InverteArranjo;

import LSE_TADPilha.Node;
import LSE_TADPilha.NodeStack;

import java.util.Arrays;

public class InverteArranjo {
    private Object[] InverteArranjo(Object[] arranjo){
        NodeStack pilha = new NodeStack();
        Object[] novoArranjo = new Object[arranjo.length];

        for (int i = 0; i < arranjo.length; i++) {
            pilha.push(arranjo[i]);
        }

        for (int i = 0; i < arranjo.length; i++) {
            novoArranjo[i] = pilha.pop();
        }
        return novoArranjo;
    }

    public String ArrayInvertido(Object[] arranjo){
        return Arrays.toString(InverteArranjo(arranjo));
    }
}
