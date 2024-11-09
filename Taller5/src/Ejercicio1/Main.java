/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author HP
 */
// Clase de prueba
public class Main {
    public static void main(String[] args) {
        try {
            // Crear un empleado con valores válidos
            Empleado emp1 = new Empleado("Juan Pérez", 35000);
            System.out.println("Empleado creado:");
            System.out.println("Nombre: " + emp1.nombre); // Acceso directo a propiedad pública
            System.out.println("Salario: $" + emp1.getSalario()); // Acceso mediante getter
            
            // Modificar el salario usando el setter
            System.out.println("\nModificando salario...");
            emp1.setSalario(40000);
            System.out.println("Nuevo salario: $" + emp1.getSalario());
            
            // Intentar establecer un salario negativo
            System.out.println("\nIntentando establecer salario negativo...");
            emp1.setSalario(-5000);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        try {
            // Intentar crear un empleado con salario excesivo
            System.out.println("\nIntentando crear empleado con salario excesivo...");
            Empleado emp2 = new Empleado("Ana García", 2000000);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
