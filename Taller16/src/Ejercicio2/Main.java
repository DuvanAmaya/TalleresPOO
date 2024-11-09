/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        Documento documento = new Documento("Contenido del documento");

        Exportador exportadorPDF = new ExportadorPDF();
        Exportador exportadorWord = new ExportadorWord();
        Exportador exportadorExcel = new ExportadorExcel();

        exportadorPDF.exportar(documento.toString());
        exportadorWord.exportar(documento.toString());
        exportadorExcel.exportar(documento.toString());
    }
}

