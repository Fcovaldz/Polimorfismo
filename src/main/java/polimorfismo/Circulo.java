/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;


public abstract class Circulo extends FiguraBidimensional {
private double radio;
    public Circulo(int lados, double perimetro) {
        super(lados, perimetro);
    }
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = 10;
        
    }
     public void setarea(){
        this.area = area = Math.PI * Math.pow(radio, 2);
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = radio*2*Math.PI;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }

    @Override
    public double area() {
        System.out.println("Area: "+ area);
    return area= Math.PI * Math.pow(radio, 2);
    }
    @Override
    public double perimetro() {
        System.out.println("Area: "+ area);
    return perimetro=  radio*2*Math.PI;
    }
}
