package edu.juan.agencia.Act3;

import edu.juan.agencia.Act3.procces.Lista_ceros;
import org.junit.Test;
import static org.junit.Assert.*;


public class Test_listas {
    Lista_ceros programa = new Lista_ceros();

    @Test
    public void Test_listas_mueve_el_cero_a_la_derecha() {
        int[] input = {0, 2, 1, 4, 0, 2};
        int[] esperado = {2, 1, 4, 2, 0, 0};
        int[] expected = programa.moverceros(input);

        assertArrayEquals(esperado, expected);
    }

    @Test
    public void Test_contar_los_pares() {
        int[] input = {3, 4, 5, 7, 6};
        int esperado = 2;
        int expected = programa.contarpares(input);

        assertEquals(esperado, expected);
    }
}