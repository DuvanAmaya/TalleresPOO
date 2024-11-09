/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2;

/**
 *
 * @author HP
 */
// Primera clase con propiedad privada y getter público
class Persona {
    private String nombre;  // Propiedad privada
    
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    // Getter público para acceder a la propiedad privada
    public String getNombre() {
        return nombre;
    }
    
    // Método público que puede acceder a la propiedad privada
    public void mostrarNombre() {
        System.out.println("Nombre (accedido internamente): " + nombre);
    }
}

// Clase que accede correctamente a través de métodos públicos
public class AccesoCorrecto {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan");
        
        // Formas correctas de acceder a la propiedad privada
        System.out.println("Nombre (usando getter): " + persona.getNombre());
        persona.mostrarNombre();
        
        // Intentemos modificar directamente la propiedad (esto NO compilará)
        // persona.nombre = "Pedro";  // Error de compilación
        
        // Para demostrar los diferentes tipos de acceso, intentemos varias operaciones
        try {
            // Este código está comentado porque causaría errores de compilación
            /*
            // Error 1: Acceso directo a propiedad privada
            String nombreDirecto = persona.nombre;
            
            // Error 2: Modificación directa de propiedad privada
            persona.nombre = "Pedro";
            
            // Error 3: Incluso usando reflexión causaría una excepción en tiempo de ejecución
            java.lang.reflect.Field field = Persona.class.getDeclaredField("nombre");
            field.setAccessible(true);
            field.set(persona, "Pedro");
            */
            
            // Solo funciona el acceso a través de métodos públicos
            System.out.println("\nDemostrando accesos correctos:");
            System.out.println("1. Usando getter: " + persona.getNombre());
            System.out.println("2. Usando método público:");
            persona.mostrarNombre();
            
        } catch (Exception e) {
            System.out.println("Se produjo un error: " + e.getMessage());
        }
    }
}
