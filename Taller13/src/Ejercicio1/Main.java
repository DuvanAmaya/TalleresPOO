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
        Figura rectangulo = new Rectangulo(4, 6);
        Figura triangulo = new Triangulo(3, 5);

        System.out.println("Área del rectángulo: " + rectangulo.calcularArea()); // Imprime el área del rectángulo
        System.out.println("Área del triángulo: " + triangulo.calcularArea());   // Imprime el área del triángulo
    }
}
