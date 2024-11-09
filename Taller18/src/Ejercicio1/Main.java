/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        Reparable maquina = new Maquina();
        Limpieza oficina = new Oficina();

        maquina.reparar();
        oficina.limpiar();
    }
}

