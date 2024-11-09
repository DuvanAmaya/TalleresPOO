/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1;

/**
 *
 * @author HP
 */
public class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    
    public Libro() {
        this.titulo = "Sin título";
        this.autor = "Anónimo";
        this.numeroPaginas = 0;
    }
    
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }
    
    @Override
    public String toString() {
        return "Libro{" +
               "titulo='" + titulo + '\'' +
               ", autor='" + autor + '\'' +
               ", numeroPaginas=" + numeroPaginas +
               '}';
    }
}
