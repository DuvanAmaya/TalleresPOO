/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author HP
 */

// Clase de prueba
public class Main {
    public static void main(String[] args) {
        Animal animal = new Perro();
        animal.hacerSonido(); // Esto funciona correctamente
        
        // Intento de invocar el método ladrar desde una referencia de tipo Animal
        //animal.ladrar(); // Error de compilación: el método ladrar() no es accesible desde la referencia Animal
    }
}
