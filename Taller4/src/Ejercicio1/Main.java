/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author HP
 */
// Ejemplo de uso
public class Main {
    public static void main(String[] args) {
        // Crear un empleado regular
        Empleado empleado = new Empleado("Juan Pérez", 30000);
        System.out.println("Información del Empleado:");
        empleado.mostrarInformacion();
        
        System.out.println("\n-------------------\n");
        
        // Crear un gerente
        Gerente gerente = new Gerente("María García", 50000, "Ventas");
        System.out.println("Información del Gerente:");
        gerente.mostrarInformacion();
    }
}
