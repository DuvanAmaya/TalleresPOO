/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

/**
 *
 * @author HP
 */
class Vehiculo {
    String tipo;  // Acceso de paquete
    
    Vehiculo(String tipo) {
        this.tipo = tipo;
    }
    
    void mostrarTipo() {
        System.out.println("Tipo de vehículo: " + tipo);
    }
}
