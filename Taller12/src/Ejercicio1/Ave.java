/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author HP
 */

// Clase Ave que implementa Volador y Cantante
class Ave implements IVolador, ICantante {
    @Override
    public void volar() {
        System.out.println("El ave está volando.");
    }

    @Override
    public void cantar() {
        System.out.println("El ave está cantando.");
    }
}
