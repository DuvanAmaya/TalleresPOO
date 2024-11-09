/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author HP
 */
// Clase Utilidades con métodos matemáticos
public class Utilidades {
    
    // Método para suma
    public static double sumar(double a, double b) {
        return a + b;
    }
    
    // Método para resta
    public static double restar(double a, double b) {
        return a - b;
    }
    
    // Método para multiplicación
    public static double multiplicar(double a, double b) {
        return a * b;
    }
    
    // Método para división con validación
    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No es posible dividir por cero");
        }
        return a / b;
    }
    
    // Método adicional para calcular porcentaje
    public static double calcularPorcentaje(double numero, double porcentaje) {
        return (numero * porcentaje) / 100;
    }
}

