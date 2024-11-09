/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author HP
 */
class Empleado extends Persona {
    public Empleado(String nombre, int edad, String departamento) {
        super(nombre, edad);
    }

    public void mostrarDetalles() {
        // System.out.println("Nombre: " + super.nombre); // Error: nombre es private
    }
}

/*
Intentar acceder a un atributo privado de la clase base: Si Persona tuviera nombre y edad
como atributos private, Empleado no podría acceder a ellos mediante super, ya que los
miembros privados no se heredan ni están accesibles en las subclases.

Explicación: super permite el acceso a los miembros protegidos (protected) o públicos
(public) de la clase base, pero no a los privados (private), ya que la encapsulación en Java
impide que estos últimos se accedan directamente desde clases derivadas.
*/