/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author HP
 */
// Clase de prueba
public class Main {
    public static void main(String[] args) {
        // Variables para las pruebas
        double num1 = 20;
        double num2 = 5;
        
        System.out.println("=== Pruebas de Operaciones Matematicas ===");
        
        // Prueba de suma
        System.out.println("\nPrueba de Suma:");
        double resultadoSuma = Utilidades.sumar(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + resultadoSuma);
        
        // Prueba de resta
        System.out.println("\nPrueba de Resta:");
        double resultadoResta = Utilidades.restar(num1, num2);
        System.out.println(num1 + " - " + num2 + " = " + resultadoResta);
        
        // Prueba de multiplicación
        System.out.println("\nPrueba de Multiplicacion:");
        double resultadoMultiplicacion = Utilidades.multiplicar(num1, num2);
        System.out.println(num1 + " * " + num2 + " = " + resultadoMultiplicacion);
        
        // Prueba de división
        System.out.println("\nPrueba de Division:");
        try {
            double resultadoDivision = Utilidades.dividir(num1, num2);
            System.out.println(num1 + " / " + num2 + " = " + resultadoDivision);
            
            // Prueba de división por cero
            System.out.println("\nPrueba de Division por Cero:");
            Utilidades.dividir(num1, 0);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // Prueba de cálculo de porcentaje
        System.out.println("\nPrueba de Calculo de Porcentaje:");
        double porcentaje = 25;
        double resultadoPorcentaje = Utilidades.calcularPorcentaje(num1, porcentaje);
        System.out.println(porcentaje + "% de " + num1 + " = " + resultadoPorcentaje);
        
        // Pruebas adicionales con decimales
        System.out.println("\n=== Pruebas con Numeros Decimales ===");
        double decimal1 = 10.5;
        double decimal2 = 2.5;
        
        System.out.println("\nSuma de decimales:");
        System.out.println(decimal1 + " + " + decimal2 + " = " + 
                          Utilidades.sumar(decimal1, decimal2));
                          
        System.out.println("\nMultiplicacion de decimales:");
        System.out.println(decimal1 + " * " + decimal2 + " = " + 
                          Utilidades.multiplicar(decimal1, decimal2));
    }
}

