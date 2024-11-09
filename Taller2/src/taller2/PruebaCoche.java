/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2;

/**
 *
 * @author HP
 */
// Clase Coche con propiedades privadas
class Coche {
    private String marca;
    private String modelo;
    private int velocidadMaxima;
    
    // Constructor
    public Coche(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }
    
    // Getters
    public String getMarca() {
        return marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
    
    // Método para acelerar
    public boolean acelerar(int incremento) {
        if (incremento > 0) {
            velocidadMaxima += incremento;
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "Coche{" +
               "marca='" + marca + '\'' +
               ", modelo='" + modelo + '\'' +
               ", velocidadMaxima=" + velocidadMaxima +
               " km/h}";
    }
}

// Clase de prueba
public class PruebaCoche {
    public static void main(String[] args) {
        // Crear un coche
        Coche miCoche = new Coche("Toyota", "Corolla", 180);
        
        // Mostrar estado inicial
        System.out.println("Estado inicial del coche:");
        System.out.println(miCoche);
        
        // Intentar acelerar con valor positivo
        System.out.println("\nIntentando acelerar 20 km/h:");
        boolean resultadoAceleracion = miCoche.acelerar(20);
        System.out.println("Aceleración exitosa: " + resultadoAceleracion);
        System.out.println(miCoche);
        
        // Intentar acelerar con valor negativo
        System.out.println("\nIntentando acelerar -10 km/h:");
        resultadoAceleracion = miCoche.acelerar(-10);
        System.out.println("Aceleración exitosa: " + resultadoAceleracion);
        System.out.println(miCoche);
        
        // Los siguientes intentos de acceso directo causarían errores de compilación
        // Estos ejemplos están comentados para mostrar qué NO se puede hacer:
        
        /*
        // Error: velocidadMaxima tiene acceso privado
        miCoche.velocidadMaxima = 200;
        
        // Error: marca tiene acceso privado
        System.out.println(miCoche.marca);
        
        // Error: modelo tiene acceso privado
        miCoche.modelo = "Camry";
        */
        
        // Forma correcta de acceder a las propiedades: usando getters
        System.out.println("\nAccediendo a las propiedades mediante getters:");
        System.out.println("Marca: " + miCoche.getMarca());
        System.out.println("Modelo: " + miCoche.getModelo());
        System.out.println("Velocidad Máxima: " + miCoche.getVelocidadMaxima() + " km/h");
    }
}
