/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author HP
 */
// Clase Coche que hereda de Vehiculo
public class Coche extends Vehiculo {
    private int numeroDePuertas;

    // Constructor de Coche
    public Coche(String marca, int velocidadMaxima, int numeroDePuertas) {
        super(marca, velocidadMaxima);  // Llama al constructor de Vehiculo
        this.numeroDePuertas = numeroDePuertas;
    }

    // Método para mostrar la información del coche
    public void mostrarInfoCoche() {
        mostrarInfoVehiculo();  // Llama al método de la clase base
        System.out.println("Número de Puertas: " + numeroDePuertas);
    }
}
