/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author HP
 */
// Clase Matematicas
public class Matematicas {

    // Método static para sumar dos números
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Método static para restar dos números
    public static int restar(int a, int b) {
        return a - b;
    }

    // Método static para multiplicar dos números
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    // Método static para dividir dos números (verificar divisor)
    public static double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: No se puede dividir por cero.");
            return 0;
        }
    }
}

