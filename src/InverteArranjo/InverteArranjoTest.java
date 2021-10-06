package InverteArranjo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InverteArranjoTest {
    @Test
    public void test(){
        InverteArranjo InvArranjo = new InverteArranjo();
        Object[] arranjo = {1,2,3,4,5,6};
        assertEquals("[6, 5, 4, 3, 2, 1]",InvArranjo.ArrayInvertido(arranjo));
        arranjo = new Object[]{5,6,2,7,9,5};
        assertEquals("[5, 9, 7, 2, 6, 5]",InvArranjo.ArrayInvertido(arranjo));
        arranjo = new Object[]{5};
        assertEquals("[5]",InvArranjo.ArrayInvertido(arranjo));
        arranjo = new Object[]{1,2,1,2,1,2};
        assertEquals("[2, 1, 2, 1, 2, 1]",InvArranjo.ArrayInvertido(arranjo));
        arranjo = new Object[]{"Start", "A", "B", "Direita", "Esquerda", "Direita", "Esquerda", "Baixo", "Baixo", "Cima", "Cima"};
        assertEquals("[Cima, Cima, Baixo, Baixo, Esquerda, Direita, Esquerda, Direita, B, A, Start]",InvArranjo.ArrayInvertido(arranjo));
    }
}
