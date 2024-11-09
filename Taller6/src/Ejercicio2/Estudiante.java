/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author HP
 */
// Clase Estudiante
public class Estudiante {
    private String nombre;
    private int edad;

    // Constructor por defecto que llama a otro constructor con this()
    public Estudiante() {
        this("Sin nombre", 0);  // Llama al constructor con parámetros
    }

    // Constructor que recibe nombre y edad
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para mostrar los detalles del estudiante
    public void mostrarEstudiante() {
        System.out.println("Nombre del estudiante: " + nombre);
        System.out.println("Edad del estudiante: " + edad);
    }
}

