/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Crear objetos usando diferentes constructores
        Libro libro1 = new Libro();
        CuentaBancaria cuenta1 = new CuentaBancaria("12345", "Corriente");
        Estudiante estudiante1 = new Estudiante();
        
        // Ingresar datos por consola para un nuevo libro
        System.out.println("Ingrese datos para un nuevo libro:");
        System.out.print("Titulo: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        System.out.print("Numero de paginas: ");
        int paginas = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        
        Libro libro2 = new Libro(titulo, autor, paginas);
        
        // Ingresar datos para una nueva cuenta bancaria
        System.out.println("\nIngrese datos para una nueva cuenta bancaria:");
        System.out.print("Numero de cuenta: ");
        String numeroCuenta = scanner.nextLine();
        System.out.print("Saldo inicial: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Tipo de cuenta: ");
        String tipoCuenta = scanner.nextLine();
        
        CuentaBancaria cuenta2 = new CuentaBancaria(numeroCuenta, saldo, tipoCuenta);
        
        // Ingresar datos para un nuevo estudiante
        System.out.println("\nIngrese datos para un nuevo estudiante:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Curso: ");
        String curso = scanner.nextLine();
        
        Estudiante estudiante2 = new Estudiante(nombre, edad, curso);
        
        // Mostrar todos los objetos creados
        System.out.println("\nObjetos creados con constructores por defecto:");
        System.out.println(libro1);
        System.out.println(cuenta1);
        System.out.println(estudiante1);
        
        System.out.println("\nObjetos creados con datos ingresados:");
        System.out.println(libro2);
        System.out.println(cuenta2);
        System.out.println(estudiante2);
        
        scanner.close();
    }
}
