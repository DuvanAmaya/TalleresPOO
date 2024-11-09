/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author HP
 */
interface Exportador {
    void exportar(String contenido);
}

class ExportadorPDF implements Exportador {
    @Override
    public void exportar(String contenido) {
        System.out.println("Exportando a PDF: " + contenido);
    }
}

class ExportadorWord implements Exportador {
    @Override
    public void exportar(String contenido) {
        System.out.println("Exportando a Word: " + contenido);
    }
}

class ExportadorExcel implements Exportador {
    @Override
    public void exportar(String contenido) {
        System.out.println("Exportando a Excel: " + contenido);
    }
}

