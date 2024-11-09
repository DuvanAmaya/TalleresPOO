/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        Transferible cuenta = new CuentaBancaria();
        Retirable cuenta2 = new CuentaBancaria();
        Pagable servicio = new ServicioPublico();

        cuenta.transferir(1000);
        cuenta2.retirar(500);
        servicio.pagarFactura(200);
    }
}

