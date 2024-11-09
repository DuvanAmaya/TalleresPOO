/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author HP
 */
interface Almacenamiento {
    void guardarArchivo(String nombre, byte[] datos);
    byte[] recuperarArchivo(String nombre);
}

