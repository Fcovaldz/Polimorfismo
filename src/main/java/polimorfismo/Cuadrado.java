/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author iampa
 */
public abstract class Cuadrado extends FiguraBidimensional {
    private double lado;

    public Cuadrado(double lado, int lados, double perimetro) {
        super(lados, perimetro);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = 10;
    }
    public void setarea(){
        this.area = lado*lado;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = lado*4;
    }

    @Override
    public double area() {
        
         return area = lado*lado;
        
    }
    @Override
    public double perimetro() {
   
         return perimetro= lado*4;
        
    }
      @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + area + perimetro +'}';
    }
    
}
