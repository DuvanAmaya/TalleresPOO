/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author HP
 */
// Clase para manejar la validación de datos de usuario
class ValidacionServicio {
    public boolean validarEmail(Usuario2 usuario) {
        return usuario.getEmail().contains("@");
    }
}
