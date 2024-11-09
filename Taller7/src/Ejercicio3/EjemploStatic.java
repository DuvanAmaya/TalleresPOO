/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author HP
 */
// Clase Ejemplo con error
/*
public class EjemploStaticError {
    private int noEstatico = 5;

    // Método static que intenta modificar un atributo no estático (esto generará un error)
    public static void modificarNoEstatico() {
        // noEstatico++;  // Error: no se puede acceder a un atributo no estático desde un contexto estático
    }
}
*/

// Clase corregida
public class EjemploStatic {
    private int noEstatico = 5;

    // Método de instancia para modificar el atributo no estático
    public void incrementarNoEstatico() {
        noEstatico++;
        System.out.println("Valor incrementado: " + noEstatico);
    }

    // Método static que recibe una instancia para modificar el atributo no estático
    public static void modificarAtributoNoEstatico(EjemploStatic instancia) {
        instancia.noEstatico++;
        System.out.println("Valor incrementado mediante instancia: " + instancia.noEstatico);
    }
}

