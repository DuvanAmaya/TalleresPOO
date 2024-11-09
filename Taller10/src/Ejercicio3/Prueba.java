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
    // Sin @Override, el compilador no avisa de errores en la sobrescritura
    public void moverse() {
        System.out.println("La bicicleta está avanzando.");
    }
}

public class Prueba {
    public static void main(String[] args) {
        Vehiculo bicicleta = new Bicicleta();
        bicicleta.moverse(); // Sin @Override, posibles errores no se detectan en compilación.
    }
}

