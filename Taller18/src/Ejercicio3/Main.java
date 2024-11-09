/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        Conducible coche = new Coche();
        Conducible camion = new Camion();
        Transportador camionConCarga = new Camion();

        coche.conducir();
        camion.conducir();
        camionConCarga.cargarMercancia();
    }
}

