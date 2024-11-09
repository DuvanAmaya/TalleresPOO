/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2y3;

/**
 *
 * @author HP
 */
// Clase Estudiante que hereda de Persona
public class Estudiante extends Persona {
    private String matricula;

    // Constructor de Estudiante
    public Estudiante(String nombre, int edad, String matricula) {
        super(nombre, edad);  // Llama al constructor de Persona
        this.matricula = matricula;
    }

    // Sobrescribe el método para mostrar los detalles del estudiante
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();  // Llama al método de la clase base
        System.out.println("Matrícula: " + matricula);
    }
}

