/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author HP
 */
// Clase Banco
public class Banco {
    protected double saldo;

    // Constructor que establece el saldo inicial
    public Banco(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método para mostrar el saldo
    public void mostrarSaldo() {
        System.out.println("Saldo actual: " + saldo);
    }
}

// Clase Banco mejorada
/*
public class Banco {
    private double saldo;

    // Constructor que establece el saldo inicial
    public Banco(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método para obtener el saldo actual
    public double getSaldo() {
        return saldo;
    }

    // Método para depositar dinero en la cuenta
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso. Saldo actual: " + saldo);
        } else {
            System.out.println("Cantidad no válida para depósito.");
        }
    }

    // Método para retirar dinero de la cuenta con validación
    public boolean retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Saldo actual: " + saldo);
            return true;
        } else {
            System.out.println("Cantidad no válida o fondos insuficientes.");
            return false;
        }
    }
}
*/
