/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2;

/**
 *
 * @author HP
 */

class Estudiante {
    private String nombre;
    private int edad;
    private double notaPromedio;
    
    // Constructor
    public Estudiante(String nombre, int edad, double notaPromedio) {
        // Utilizamos los setters para aprovechar las validaciones
        setNombre(nombre);
        setEdad(edad);
        setNotaPromedio(notaPromedio);
    }
    
    // Getter y Setter para nombre
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }
        if (nombre.length() < 2 || nombre.length() > 50) {
            throw new IllegalArgumentException("El nombre debe tener entre 2 y 50 caracteres");
        }
        this.nombre = nombre.trim();
    }
    
    // Getter y Setter para edad
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        if (edad < 5 || edad > 120) {
            throw new IllegalArgumentException("La edad debe estar entre 5 y 120 años");
        }
        this.edad = edad;
    }
    
    // Getter y Setter para notaPromedio
    public double getNotaPromedio() {
        return notaPromedio;
    }
    
    public void setNotaPromedio(double notaPromedio) {
        if (notaPromedio < 0 || notaPromedio > 10) {
            throw new IllegalArgumentException("La nota promedio debe estar entre 0 y 10");
        }
        this.notaPromedio = notaPromedio;
    }
    
    // Método toString para mostrar la información del estudiante
    @Override
    public String toString() {
        return "Estudiante{" +
               "nombre='" + nombre + '\'' +
               ", edad=" + edad +
               ", notaPromedio=" + notaPromedio +
               '}';
    }
}

// Clase de prueba
public class PruebaEstudiante {
    public static void main(String[] args) {
        try {
            // Crear estudiantes y probar las validaciones
            System.out.println("Creando estudiante con datos validos:");
            Estudiante estudiante1 = new Estudiante("Juan Perez", 20, 8.5);
            System.out.println(estudiante1);
            
            System.out.println("\nModificando datos del estudiante:");
            estudiante1.setEdad(21);
            estudiante1.setNotaPromedio(9.0);
            System.out.println(estudiante1);
            
            System.out.println("\nProbando validaciones:");
            
            // Probar nombre inválido
            try {
                estudiante1.setNombre("");
            } catch (IllegalArgumentException e) {
                System.out.println("Error de nombre: " + e.getMessage());
            }
            
            // Probar edad inválida
            try {
                estudiante1.setEdad(150);
            } catch (IllegalArgumentException e) {
                System.out.println("Error de edad: " + e.getMessage());
            }
            
            // Probar nota promedio inválida
            try {
                estudiante1.setNotaPromedio(11);
            } catch (IllegalArgumentException e) {
                System.out.println("Error de nota: " + e.getMessage());
            }
            
            // Crear otro estudiante con diferentes valores
            System.out.println("\nCreando otro estudiante:");
            Estudiante estudiante2 = new Estudiante("María García", 18, 9.5);
            System.out.println(estudiante2);
            
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear estudiante: " + e.getMessage());
        }
    }
}
