/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author HP
 */
// Clase Empleado
public class Empleado {
    // Propiedad nombre pública
    public String nombre;
    
    // Propiedad salario privada
    private double salario;
    
    // Constructor
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.setSalario(salario); // Usamos el setter para aprovechar las validaciones
    }
    
    // Getter para salario
    public double getSalario() {
        return this.salario;
    }
    
    // Setter para salario con validaciones
    public void setSalario(double salario) {
        // Validamos que el salario sea positivo y no exceda un límite razonable
        if (salario < 0) {
            throw new IllegalArgumentException("El salario no puede ser negativo");
        }
        if (salario > 1000000) {
            throw new IllegalArgumentException("El salario excede el límite permitido");
        }
        this.salario = salario;
    }
}

