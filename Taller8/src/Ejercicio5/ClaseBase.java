/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author HP
 */
// Clase Base con un atributo privado
class ClaseBase {
    private int atributoPrivado = 10;
}

// Clase Derivada que intenta acceder al atributo privado (esto generará un error)
class ClaseDerivada extends ClaseBase {
    public void mostrarAtributo() {
        // System.out.println("Atributo Privado: " + atributoPrivado);  // Error: atributoPrivado no es accesible
    }
}

