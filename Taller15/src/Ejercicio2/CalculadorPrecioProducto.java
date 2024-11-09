/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author HP
 */
// Clase para calcular el precio de un producto
public class CalculadorPrecioProducto {
    private static final double IMPUESTO = 1.19;

    public double calcularPrecioFinal(Producto2 producto) {
        return producto.getPrecioBase() * IMPUESTO;
    }
}
