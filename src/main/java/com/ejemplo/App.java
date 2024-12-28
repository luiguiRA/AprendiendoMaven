package com.ejemplo;

/**
 * Clase principal con una funcionalidad básica.
 */
public class App {
    /**
     * Método principal que suma dos números.
     *
     * @param a el primer número
     * @param b el segundo número
     * @return la suma de los dos números
     */
    public static int suma(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("¡Hola, mundo!");
        int resultado = suma(3, 5);
        System.out.println("La suma de 3 + 5 es: " + resultado);
    }
}
