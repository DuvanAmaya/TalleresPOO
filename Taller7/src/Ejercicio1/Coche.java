/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author HP
 */
// Clase Coche
public class Coche {
    private String marca;
    private String modelo;
    private static int contadorCoches = 0;

    // Constructor que incrementa el contador cada vez que se crea un coche
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++;
    }

    // Método static para mostrar cuántos coches se han creado
    public static void mostrarContadorCoches() {
        System.out.println("Total de coches creados: " + contadorCoches);
    }

    // Método para mostrar la información del coche
    public void mostrarInfoCoche() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo);
    }
}

