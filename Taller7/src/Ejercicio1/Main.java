/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author HP
 */
// Clase de prueba para Coche
public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Corolla");
        Coche coche2 = new Coche("Honda", "Civic");
        
        coche1.mostrarInfoCoche();
        coche2.mostrarInfoCoche();
        
        // Mostrar cuántos coches se han creado
        Coche.mostrarContadorCoches();  // Debe mostrar 2
    }
}

