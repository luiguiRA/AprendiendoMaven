package com.ejemplo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase de pruebas para la clase App.
 */
public class AppTest {

    @Test
    public void testSuma() {
        int resultado = App.suma(3, 5);
        assertEquals("La suma de 3 y 5 debería ser 8", 8, resultado);
    }

    @Test
    public void testSumaNegativa() {
        int resultado = App.suma(-2, -3);
        assertEquals("La suma de -2 y -3 debería ser -5", -5, resultado);
    }
}
