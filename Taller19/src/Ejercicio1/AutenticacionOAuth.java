/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author HP
 */
class AutenticacionOAuth implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contrasena) {
        // Lógica de autenticación OAuth
        System.out.println("Autenticando usuario con OAuth...");
        return "usuarioOAuth".equals(usuario) && "passwordOAuth".equals(contrasena);
    }
}