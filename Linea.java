/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author oscar
 */
public class Linea extends Formas {
    public Linea() {
        super(); //
    }
    @Override
    public void dibujar() {
        System.out.println("línea."); 
    }
    
    protected int x1, y1; 
    protected int x2, y2; 

    // Constructor
    public Linea(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public double calcularLongitud() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
class LineaConLargo extends Linea {
    private double largo; // 

    public LineaConLargo(int x1, int y1, int x2, int y2) {
        super(x1, y1, x2, y2); 
        this.largo = calcularLongitud(); 
    }
    public double obtenerLargo() {
        return largo;
    }
  }

