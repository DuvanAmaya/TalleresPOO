/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        String mensaje = "Hola, este es un mensaje de prueba";
        String destinatario = "usuario@ejemplo.com";

        CanalEnvio correo = new EnvioCorreo();
        CanalEnvio sms = new EnvioSMS();
        CanalEnvio push = new EnvioNotificacionPush();

        correo.enviar(mensaje, destinatario);
        sms.enviar(mensaje, destinatario);
        push.enviar(mensaje, destinatario);
    }
}

