/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author HP
 */
// Clase para manejar la autenticación de usuarios
class AutenticacionServicio {
    public boolean autenticar(Usuario2 usuario, String nombreUsuario, String contraseña) {
        return usuario.getNombreUsuario().equals(nombreUsuario) &&
               usuario.getContraseña().equals(contraseña);
    }
}
