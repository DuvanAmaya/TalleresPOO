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
        GeneradorReporte reportePDF = new ReportePDF();
        GestorReportes gestorReportes = new GestorReportes(reportePDF);

        gestorReportes.crearReporte("Contenido del reporte");
    }
}

