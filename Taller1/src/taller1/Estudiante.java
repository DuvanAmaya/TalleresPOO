/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1;

/**
 *
 * @author HP
 */
public class Estudiante {
    private String nombre;
    private int edad;
    private String curso;
    
    // Constructor por defecto
    public Estudiante() {
        this.nombre = "Estudiante";
        this.edad = 18;
        this.curso = "Sin asignar";
    }
    
    // Constructor con nombre y edad
    public Estudiante(String nombre, int edad) {
        this();  // Llama al constructor por defecto
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // Constructor con todos los parámetros
    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad);  // Llama al constructor con nombre y edad
        this.curso = curso;
    }
    
    @Override
    public String toString() {
        return "Estudiante{" +
               "nombre='" + nombre + '\'' +
               ", edad=" + edad +
               ", curso='" + curso + '\'' +
               '}';
    }
}
