/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;


public abstract class FiguraBidimensional extends Figura {
    int lados;
    protected double perimetro;
    public abstract double perimetro();

    public FiguraBidimensional(int lados, double perimetro) {
        this.lados = lados;
        this.perimetro = perimetro;
    }

    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    

    @Override
    public String toString() {
        return "FiguraBidimensional{" + "lados=" + lados + ", perimetro=" + perimetro + '}';
    }
}
