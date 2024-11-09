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
        Vehiculo vehiculo = new Vehiculo();
        Vehiculo bicicleta = new Bicicleta(); // Polimorfismo

        vehiculo.moverse();    // Imprime: El vehículo se está moviendo.
        bicicleta.moverse();   // Imprime: La bicicleta está avanzando.
    }
}

