/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;


public abstract class Cubo extends FiguraTridimensional {
private double lado;

    public Cubo(int caras, double volumen) {
        super(caras, volumen);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cubo{" + "lado=" + lado + '}';
    }

    @Override
    public double area() {
       int a = 10;
       return area = 6*a*a;
    }
    @Override
    public double volumen() {
       int a = 10;
       return volumen = a*a*a;
    }
    
}
