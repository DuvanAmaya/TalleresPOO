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
        Empleado gerente = new Gerente("Ana", 3000);
        Empleado vendedor = new Vendedor("Luis", 2000, 500);

        gerente.mostrarDetalles();   // Imprime detalles del gerente
        vendedor.mostrarDetalles();  // Imprime detalles del vendedor
    }
}
