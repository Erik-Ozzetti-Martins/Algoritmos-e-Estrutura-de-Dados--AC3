package Parenteses;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestParentese {
    @Test
    void Test (){
        String expressao = "{()}";
        Parenteses entrada = new Parenteses(expressao);
        assertEquals(true, entrada.validarFormacao());
        expressao = "{{[()]}}";
        entrada = new Parenteses(expressao);
        assertEquals(true, entrada.validarFormacao());
        expressao = "{(){}";
        entrada = new Parenteses(expressao);
        assertEquals(false, entrada.validarFormacao());
        expressao = "{[{(])}}";
        entrada = new Parenteses(expressao);
        assertEquals(false, entrada.validarFormacao());
        expressao = "{1+(2*3)}";
        entrada = new Parenteses(expressao);
        assertEquals(true, entrada.validarFormacao());
    }
}
