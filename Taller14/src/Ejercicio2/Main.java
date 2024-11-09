/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author HP
 */

// Clase de prueba
public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Estudiante();
        Persona persona3 = new Profesor();

        persona1.presentarse(); // Imprime mensaje de Persona
        persona2.presentarse(); // Imprime mensaje de Estudiante
        persona3.presentarse(); // Imprime mensaje de Profesor
    }
}
