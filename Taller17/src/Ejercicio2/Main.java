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
        try {
            CuentaBancaria cuenta = new CuentaAhorros(1000, 0.05);
            cuenta.depositar(500);
            cuenta.retirar(200);

            System.out.println("Saldo después de operaciones: " + cuenta.obtenerSaldo());

            if (cuenta instanceof CuentaAhorros) {
                ((CuentaAhorros) cuenta).aplicarInteres();
                System.out.println("Saldo después de aplicar interés: " + cuenta.obtenerSaldo());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

