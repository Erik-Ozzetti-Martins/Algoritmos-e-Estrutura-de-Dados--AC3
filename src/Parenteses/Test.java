package Parenteses;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestParentese {
    @Test
    void Test (){
       String expressao = "{()}";
//       String expressao = "{{[()]}}";
//       String expressao = "{}";
//       String expressao = "{(){}";
//        String expressao = "{(})}";
//        String expressao = "{1+(2*3)}";
          //String expressao = "{([)}";
        Parenteses entrada = new Parenteses(expressao);
        assertEquals(true, entrada.validarFormacao());


    }
}
