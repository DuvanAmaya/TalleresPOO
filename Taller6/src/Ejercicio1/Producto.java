/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author HP
 */
// Clase Producto
public class Producto {
    private String nombre;
    private double precio;

    // Constructor que recibe nombre y precio
    public Producto(String nombre, double precio) {
        this.nombre = nombre;  // Uso de this para referenciar el atributo de la clase
        this.precio = precio;
    }

    // Método para mostrar los detalles del producto
    public void mostrarProducto() {
        System.out.println("Nombre del producto: " + nombre);
        System.out.println("Precio del producto: " + precio);
    }
}

