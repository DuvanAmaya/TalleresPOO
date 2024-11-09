/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author HP
 */
// Clase de prueba para EjemploThisStatic
public class Main {
    public static void main(String[] args) {
        EjemploThisStatic ejemplo = new EjemploThisStatic();
        ejemplo.metodoInstancia();  // Llamada al método de instancia

        EjemploThisStatic.metodoEstatico(ejemplo);  // Pasando la instancia al método estático
    }
}

