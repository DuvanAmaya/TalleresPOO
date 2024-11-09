/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author HP
 */
// Clase de prueba
public class PruebaAcceso {
    public static void main(String[] args) {
        // Creamos una instancia de Moto
        Moto moto = new Moto("Moto", "Yamaha", 250);
        moto.mostrarInfo();  // Acceso permitido al método public

        // Intentar acceder directamente a las propiedades protected (tipo y marca) desde una clase no relacionada
        // Esto generará un error de compilación
        // System.out.println(moto.tipo);  // Error: tipo tiene acceso protegido
        // System.out.println(moto.marca); // Error: marca tiene acceso protegido
    }
}

