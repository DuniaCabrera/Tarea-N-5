/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author oscar
 */
public class Circulo extends Formas{
    public Circulo() {
        super();
    }
    @Override
    public void dibujar() {
        System.out.println("círculo.");
    }
    
    protected int x, y; // 
    public Circulo(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public double calcularArea() {
        return Math.PI * Math.pow(calcularRadio(), 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * calcularRadio();
    }
    
    public double calcularRadio() {
        return 0; 
    }
}

class CirculoConRadio extends Circulo {
    private double radio;

    public CirculoConRadio(int x, int y, double radio) {
        super(x, y);
        this.radio = radio;
    }
    @Override
    public double calcularRadio() {
        return radio;
    }
}



