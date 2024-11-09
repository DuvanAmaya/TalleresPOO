/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prueba;

/**
 *
 * @author HP
 */
import Vehiculos.Moto;
// import vehiculos.Vehiculo;  // Esto no funcionaría porque Vehiculo tiene acceso de paquete

public class Prueba {
    public static void main(String[] args) {
        // Vehiculo v = new Vehiculo("Coche");  // Error: No se puede acceder a la clase Vehiculo
        
        Moto m = new Moto("Moto deportiva", 600);  // Esto funciona porque Moto es public
        // m.tipo = "Otro tipo";  // Error: No se puede acceder a tipo
        // m.mostrarTipo();  // Error: No se puede acceder a mostrarTipo()
        
        m.mostrarDetalles();  // Esto funciona porque es un método público
    }
}
