/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author HP
 */
public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    
    // Constructor
    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    // Métodos relacionados con la información
    public String getDetalles() {
        return "Título: " + titulo + ", Autor: " + autor + ", ISBN: " + isbn;
    }

    // Método para generar un reporte del libro
    public void generarReporte() {
        System.out.println("Generando reporte para: " + titulo);
        // Lógica para generar el reporte
    }

    // Método para guardar en base de datos
    public void guardar() {
        System.out.println("Guardando " + titulo + " en la base de datos");
        // Lógica para la persistencia
    }
}

