/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author HP
 */
// Clase derivada Coche que sobrescribe el método encender
class Coche extends Vehiculo {
    @Override
    public void encender() {
        // La sobrescritura aquí es innecesaria ya que no se cambia el comportamiento
        System.out.println("El vehículo está encendido.");
    }
}
