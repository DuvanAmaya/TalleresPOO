/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author HP
 */
// Clase ejemplo con error
/*
public class EjemploThisStatic {
    private String atributo;

    // Método static (esto generará un error)
    public static void metodoEstatico() {
        // System.out.println(this.atributo);  // Error: no se puede usar this en un método estático
    }
}
*/

// Clase corregida
public class EjemploThisStatic {
    private String atributo;

    // Método de instancia que puede usar this
    public void metodoInstancia() {
        System.out.println(this.atributo);  // Correcto: uso de this en un método no estático
    }

    // Método estático que no usa this
    public static void metodoEstatico(EjemploThisStatic instancia) {
        System.out.println(instancia.atributo);  // Acceso correcto al atributo mediante la instancia pasada
    }
}
