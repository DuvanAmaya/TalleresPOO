/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author HP
 */
// Clase Perro implementa Volador, aunque no tiene sentido para su funcionalidad
class Perro implements IVolador {
    @Override
    public void volar() {
        System.out.println("El perro no puede volar.");
    }
}
