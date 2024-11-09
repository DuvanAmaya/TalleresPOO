/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author HP
 */

// Clase Perro implementa Nadador, aunque no es relevante
class Perro implements INadador {
    @Override
    public void nadar() {
        System.out.println("El perro nada, aunque no es su habilidad principal.");
    }
}