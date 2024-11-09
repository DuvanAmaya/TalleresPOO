/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author HP
 */
// Clase de prueba para Estudiante
public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.mostrarEstudiante();

        Estudiante estudiante2 = new Estudiante("Carlos", 20);
        estudiante2.mostrarEstudiante();
    }
}

