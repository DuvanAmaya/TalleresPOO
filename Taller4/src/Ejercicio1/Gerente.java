/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author HP
 */
// Clase hija Gerente que hereda de Empleado
public class Gerente extends Empleado {
    private String departamento;
    
    // Constructor
    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario); // Llamada al constructor de la clase padre
        this.departamento = departamento;
    }
    
    // Sobrescritura del método mostrarInformacion
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Llamamos al método de la clase padre
        System.out.println("Departamento: " + departamento);
    }
}

