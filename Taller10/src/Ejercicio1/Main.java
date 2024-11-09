/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author HP
 */
// Clase de prueba
public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Persona estudiante = new Estudiante(); // Polimorfismo
        Persona profesor = new Profesor();     // Polimorfismo

        persona.presentarse();    // Imprime: Hola, soy una persona.
        estudiante.presentarse(); // Imprime: Hola, soy un estudiante.
        profesor.presentarse();   // Imprime: Hola, soy un profesor.
    }
}

