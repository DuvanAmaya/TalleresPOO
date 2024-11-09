/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author HP
 */
class ServicioPublico implements Pagable {
    @Override
    public void pagarFactura(double cantidad) {
        System.out.println("Pagando factura de " + cantidad);
    }
}
