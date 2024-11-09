/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author HP
 */
public class Tienda {
    public static void main(String[] args) {
        Descuento descuentoPorcentaje = new Descuento(10); // 10% de descuento
        DescuentoFijo descuentoFijo = new DescuentoFijo(20); // Descuento fijo de $20

        double precioOriginal = 100;

        System.out.println("Precio con descuento porcentual: " + descuentoPorcentaje.aplicarDescuento(precioOriginal));
        System.out.println("Precio con descuento fijo: " + descuentoFijo.aplicarDescuento(precioOriginal));
    }
}

