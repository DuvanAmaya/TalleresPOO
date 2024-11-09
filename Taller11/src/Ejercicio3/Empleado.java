/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author HP
 */
abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    // Método concreto en lugar de abstracto
    public double calcularSalario() {
        return 0; // Retorna 0, pero esto es inapropiado ya que cada subclase debe definir su cálculo de salario
    }
}

