/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author HP
 */
// Clase de prueba para EjemploStatic
public class Main {
    public static void main(String[] args) {
        EjemploStatic ejemplo = new EjemploStatic();

        ejemplo.incrementarNoEstatico();  // Método de instancia

        EjemploStatic.modificarAtributoNoEstatico(ejemplo);  // Método estático que modifica el atributo usando una instancia
    }
}

