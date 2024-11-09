/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author HP
 */
// Clase de prueba para Empleado y Gerente
public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Carlos", 50000);
        Gerente gerente = new Gerente("Laura", 80000, "Ventas");

        empleado.mostrarDetalles();
        System.out.println();
        gerente.mostrarDetalles();
    }
}

