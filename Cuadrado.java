/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author oscar
 */
public class Cuadrado extends Formas {
    public Cuadrado() {
        super(); 
    }
   @Override
    public void dibujar() {
        System.out.println(" Cuadrado.");
    }
        protected double lado;

    // Constructor
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return lado * lado;
    }
}

class CuadradoConArea extends Cuadrado {
    public CuadradoConArea(double lado) {
        super(lado);
    }

    public void mostrarArea() {
        double area = calcularArea();
        System.out.println("Área del cuadrado: " + area);
    }
}

