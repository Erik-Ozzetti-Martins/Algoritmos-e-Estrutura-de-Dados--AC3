package TADPilhaArray;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import Array.EmptyStackException;
import Array.FullStackException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArrayStackTest {
    static final ArrayStack<Integer> a = new ArrayStack<Integer>(3);
    @Test
    void pilhaInteiros() {
        a.push(8);
        assertEquals("[8]", a.toString(), "Deve imprimir [8]");
        a.push(9);
        assertEquals("[8, 9]", a.toString(), "Deve imprimir [8, 9]");
        a.push(1);
        assertEquals("[8, 9, 1]", a.toString(), "Deve imprimir [8, 9, 1]");

        Assertions.assertThrows(FullStackException.class, () -> { a.push(2); });

        assertEquals(1, a.pop(), "Deve ter desempilhado 1");
        assertEquals("[8, 9]", a.toString(), "Deve imprimir [7, 9]");
        assertEquals(9, a.pop(), "Deve ter desempilhado 9");
        assertEquals("[8]", a.toString(), "Deve imprimir [8]");
        assertEquals(8, a.pop(), "Deve ter desempilhado 8");
        assertEquals("[]", a.toString(), "Deve imprimir []");

        assertTrue(a.isEmpty());

        Assertions.assertThrows(EmptyStackException.class, () -> { a.pop(); });
    }
}

