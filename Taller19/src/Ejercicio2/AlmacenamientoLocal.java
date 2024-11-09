/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author HP
 */
class AlmacenamientoLocal implements Almacenamiento {
    @Override
    public void guardarArchivo(String nombre, byte[] datos) {
        System.out.println("Guardando archivo localmente: " + nombre);
        // Lógica de guardado local
    }

    @Override
    public byte[] recuperarArchivo(String nombre) {
        System.out.println("Recuperando archivo localmente: " + nombre);
        return new byte[0]; // Datos simulados
    }
}



