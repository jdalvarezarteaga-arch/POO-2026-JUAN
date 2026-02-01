package edu.juan.agencia.Act3;

import edu.juan.agencia.Act3.procces.Strings;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test_strings {

    Strings programa = new Strings();

    @Test
    public void si_es_un_palindromo() {
        boolean resultado = programa.Palindromo("ana");
        assertTrue(resultado);
    }

    @Test
    public void no_es_un_palindromo() {
        boolean resultado = programa.Palindromo("hola mundo");
        assertFalse(resultado);
    }
    @Test
    public void testContarVocales() {
        assertEquals(3, programa.contarVocales("Chicharron"));

        assertEquals(4, programa.contarVocales("America"));

        assertEquals(0, programa.contarVocales("Ghmvrthjp"));

    }
    @Test
    public void test_Invertir_la_Cadena_Manual() {
        assertEquals("aloh", programa.invertirCadenaManual("hola"));
        assertEquals("odnum", programa.invertirCadenaManual("mundo"));
    }


    @Test
    public void test_para_Buscar_el_Caracter_Manual() {

        assertEquals(1, programa.buscarCaracterManual("hola", 'o'));


        assertEquals(-1, programa.buscarCaracterManual("hola", 'r'));
    }
}