/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author HP
 */
interface CanalEnvio {
    void enviar(String mensaje, String destinatario);
}

class EnvioCorreo implements CanalEnvio {
    @Override
    public void enviar(String mensaje, String destinatario) {
        System.out.println("Enviando correo a " + destinatario + ": " + mensaje);
    }
}

class EnvioSMS implements CanalEnvio {
    @Override
    public void enviar(String mensaje, String destinatario) {
        System.out.println("Enviando SMS a " + destinatario + ": " + mensaje);
    }
}

class EnvioNotificacionPush implements CanalEnvio {
    @Override
    public void enviar(String mensaje, String destinatario) {
        System.out.println("Enviando notificación push a " + destinatario + ": " + mensaje);
    }
}

