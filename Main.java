/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clases;

/**
 *
 * @author oscar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        Formas circulo = new Circulo();
        Formas linea= new Linea();
        Formas triangulo = new Triangulo();
        Formas cuadrado = new Cuadrado();

        circulo.dibujar();
        linea.dibujar();  
        triangulo.dibujar(); 
        cuadrado.dibujar();
    }
}
