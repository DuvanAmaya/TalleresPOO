/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

/**
 *
 * @author HP
 */
public class Moto extends Vehiculo {
    private int cilindrada;
    
    public Moto(String tipo, int cilindrada) {
        super(tipo);  // Llamada al constructor de la clase padre
        this.cilindrada = cilindrada;
    }
    
    public void mostrarDetalles() {
        // Puede acceder a tipo y mostrarTipo() porque está en el mismo paquete
        mostrarTipo();
        System.out.println("Cilindrada: " + cilindrada + "cc");
    }
}
