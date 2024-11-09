/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author HP
 */
// Clase Persona que implementa Hablador y Trabajador
class Persona implements IHablador, ITrabajador {
    @Override
    public void hablar() {
        System.out.println("La persona está hablando.");
    }

    @Override
    public void trabajar() {
        System.out.println("La persona está trabajando.");
    }
}
