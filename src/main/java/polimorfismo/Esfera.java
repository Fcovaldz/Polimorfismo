/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;


public abstract class Esfera extends FiguraTridimensional {
private double radio;
    public Esfera(int caras, double volumen) {
        super(caras, volumen);
    }
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = 10;
    }

    @Override
    public String toString() {
        return "Esfera{" + "radio=" + radio + '}';
    }

    @Override
    public double area() {
       return area = 4 * 3.1413 * radio*radio;
    }
    
    @Override
    public double volumen() {
       return volumen = 4/3 * 3.1413 * radio*radio*radio;
    }
    
}
