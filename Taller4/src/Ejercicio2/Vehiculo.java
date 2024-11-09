/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author HP
 */
// Clase Vehículo
public class Vehiculo {
    protected String tipo;
    protected String marca;

    // Constructor
    public Vehiculo(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }

    // Método para mostrar información del vehículo
    public void mostrarInfo() {
        System.out.println("Tipo: " + tipo + ", Marca: " + marca);
    }
}

