/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Producto;

/**
 *
 * @author HP
 */
// Producto.java
class Producto {
    // Propiedades con acceso de paquete (default)
    String nombre;
    double precio;
    int stock;
    
    // Constructor con acceso de paquete
    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    
    // Método con acceso de paquete
    void mostrarInfo() {
        System.out.println("Información del producto:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + String.format("%.2f", precio));
        System.out.println("Stock: " + stock + " unidades");
    }
}

// ProductoTest.java
public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Producto
        Producto p1 = new Producto("Laptop", 999.99, 10);
        
        // Acceder a las propiedades directamente (permitido por estar en el mismo paquete)
        System.out.println("Acceso directo a propiedades:");
        System.out.println("Nombre: " + p1.nombre);
        System.out.println("Precio: " + p1.precio);
        System.out.println("Stock: " + p1.stock);
        
        // Llamar al método mostrarInfo()
        System.out.println("\nUsando método mostrarInfo():");
        p1.mostrarInfo();
        
        // Modificar valores (permitido por estar en el mismo paquete)
        p1.precio = 899.99;
        p1.stock = 8;
        
        System.out.println("\nDespués de modificar valores:");
        p1.mostrarInfo();
    }
}
