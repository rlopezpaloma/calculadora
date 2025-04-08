package com.calc;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculadora calc = new Calculadora(2,3);
        int suma = calc.suma();
        System.out.println("La suma de 2 y 3 es igual a " + suma);
    }
}
