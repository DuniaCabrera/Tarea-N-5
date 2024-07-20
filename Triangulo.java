/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author oscar
 */
public class Triangulo extends Formas {
    public Triangulo() {
        super();
    }
    
    @Override
    public void dibujar() {
        System.out.println(" triángulo.");
    }
    protected double lado1, lado2, lado3; 

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double calcularArea() {
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    public double calcularAngulo(double ladoA, double ladoB, double ladoC) {
        return Math.toDegrees(Math.acos((ladoA*ladoA + ladoB*ladoB - ladoC*ladoC) / (2 * ladoA * ladoB)));
    }
}

class TrianguloConAnguloYArea extends Triangulo {
    private double angulo; 

    public TrianguloConAnguloYArea(double lado1, double lado2, double lado3) {
        super(lado1, lado2, lado3); 
        this.angulo = calcularAngulo(lado1, lado2, lado3); 
    }

    public double obtenerAngulo() {
        return angulo;
    }
}
