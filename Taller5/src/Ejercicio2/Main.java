/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author HP
 */
// Clase de prueba que demuestra los errores de acceso
public class Main {
    public static void main(String[] args) {
        // Crear una cuenta bancaria
        CuentaBancaria cuenta = new CuentaBancaria("1234-5678", 1000.0, "Ahorro");
        
        // Accesos válidos
        System.out.println("=== Accesos Válidos ===");
        System.out.println("Tipo de cuenta (acceso directo): " + cuenta.tipoCuenta);
        System.out.println("Saldo (mediante getter): $" + cuenta.getSaldo());
        
        // Modificar saldo mediante setter
        cuenta.setSaldo(1500.0);
        System.out.println("Nuevo saldo: $" + cuenta.getSaldo());
        
        // Mostrar todos los detalles usando el método público
        System.out.println("\n=== Detalles Completos ===");
        cuenta.mostrarDetalles();
        
        /* Los siguientes accesos causarían errores de compilación */
        
        // Error: numeroCuenta tiene acceso privado
        // System.out.println(cuenta.numeroCuenta);  // ERROR
        
        // Error: no se puede modificar numeroCuenta directamente
        // cuenta.numeroCuenta = "8765-4321";        // ERROR
        
        // Error: no se puede acceder directamente al saldo
        // System.out.println(cuenta.saldo);         // ERROR
        
        // Error: no se puede modificar el saldo directamente
        // cuenta.saldo = 2000.0;                    // ERROR
    }
}
