/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author HP
 */
// Clase CuentaBancaria
public class CuentaBancaria {
    // Propiedades con diferentes niveles de acceso
    private String numeroCuenta;
    private double saldo;
    public String tipoCuenta;
    
    // Constructor
    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }
    
    // Getter para saldo
    public double getSaldo() {
        return this.saldo;
    }
    
    // Setter para saldo con validación básica
    public void setSaldo(double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("El saldo no puede ser negativo");
        }
        this.saldo = saldo;
    }
    
    // Método para mostrar detalles de la cuenta
    public void mostrarDetalles() {
        System.out.println("Detalles de la cuenta:");
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Saldo: $" + saldo);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
    }
}
