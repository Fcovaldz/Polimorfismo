/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;


public abstract class FiguraTridimensional extends Figura {
    int caras;
    protected double volumen;
    public abstract double volumen();

    public FiguraTridimensional(int caras, double volumen) {
        this.caras = caras;
        this.volumen = volumen;
    }

    public int getCaras() {
        return caras;
    }

    public void setCaras(int caras) {
        this.caras = caras;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    @Override
    public String toString() {
        return "FiguraTridimensional{" + "caras=" + caras + ", volumen=" + volumen + '}';
    }
}
