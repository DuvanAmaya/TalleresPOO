/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;

/**
 *
 * @author HP
 */
// Persona.java
class Persona {
    private String nombre;    // Atributo privado
    int edad;                // Atributo de paquete (default)
    
    // Constructor
    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // Métodos getter y setter para nombre (privado)
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // Método para mostrar información
    void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

// PersonaTest.java
public class PersonaTest {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 25);
        
        // Acceso a atributo de paquete (edad)
        System.out.println("Edad directa: " + persona.edad);
        persona.edad = 26;  // Modificación directa permitida
        
        // Acceso a atributo privado (nombre)
        // System.out.println(persona.nombre);  // Error: nombre es privado
        System.out.println("Nombre a través de getter: " + persona.getNombre());
        persona.setNombre("Juan Carlos");  // Modificación a través de setter
        
        // Mostrar toda la información
        System.out.println("\nInformación completa:");
        persona.mostrarInfo();
        
        // Demostración de acceso y modificación
        System.out.println("\nDemostrando modificaciones:");
        persona.edad = 27;                  // Modificación directa del atributo de paquete
        persona.setNombre("Juan Pablo");    // Modificación del atributo privado mediante setter
        persona.mostrarInfo();
    }
}
