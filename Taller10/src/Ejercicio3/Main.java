/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author HP
 */
class Vehiculo {
    public void moverse() {
        System.out.println("El vehículo se está moviendo.");
    }
}

class Bicicleta extends Vehiculo {
    // Esto no es una sobrescritura válida porque la firma ha cambiado.
    // Es un método nuevo, no una sobrescritura.
    public void moverse(String tipo) {
        System.out.println("La bicicleta está avanzando en " + tipo + ".");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Bicicleta();
        vehiculo.moverse(); // Compila y usa el método de Vehiculo, no el de Bicicleta con parámetro.
    }
}

