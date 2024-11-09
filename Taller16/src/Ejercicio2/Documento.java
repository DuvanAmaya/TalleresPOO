/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author HP
 */
class Documento {
    private String contenido;

    public Documento(String contenido) {
        this.contenido = contenido;
    }

    public void exportarPDF() {
        System.out.println("Exportando a PDF: " + contenido);
    }
}

