/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author HP
 */
class CuentaBancaria implements Retirable, Transferible {
    @Override
    public void transferir(double cantidad) {
        System.out.println("Transfiriendo " + cantidad);
    }

    @Override
    public void retirar(double cantidad) {
        System.out.println("Retirando " + cantidad);
    }
}
