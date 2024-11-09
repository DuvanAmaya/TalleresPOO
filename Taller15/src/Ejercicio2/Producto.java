/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author HP
 */
public class Producto {
    private String nombre;
    private double precioBase;
    
    // Constructor
    public Producto(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    // Métodos relacionados con la información
    public String getDetalles() {
        return "Nombre: " + nombre + ", Precio base: " + precioBase;
    }

    // Método para generar etiqueta
    public String generarEtiqueta() {
        return "Producto: " + nombre + " - Precio: $" + calcularPrecio();
    }

    // Método para calcular el precio final con impuestos
    public double calcularPrecio() {
        return precioBase * 1.19; // Supongamos que el impuesto es del 19%
    }
}

