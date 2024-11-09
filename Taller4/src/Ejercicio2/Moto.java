/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author HP
 */
// Subclase Moto
public class Moto extends Vehiculo {
    private int cilindrada;

    // Constructor
    public Moto(String tipo, String marca, int cilindrada) {
        super(tipo, marca);  // Llama al constructor de la clase padre Vehiculo
        this.cilindrada = cilindrada;
    }

    // Método para mostrar información de la moto
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Cilindrada: " + cilindrada + " cc");
    }
}

