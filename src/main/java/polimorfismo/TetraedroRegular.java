/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;


public abstract class TetraedroRegular extends FiguraTridimensional {
 private double lado;
    public TetraedroRegular(int caras, double volumen) {
        super(caras, volumen);
    }
   
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = 10;
    }

    @Override
    public double area() {
       
        return area = lado*lado/2*4;
    }
    @Override
    public double volumen() {
       int a = 5;
       double r1,r2,r3,r4;
       r1 = Math.sqrt(2);
       r2 = Math.pow(a, 3);
       r3 = r1/12;
       r4 = r2 * r3;
       return r4;
    }
    
    @Override
    public String toString() {
        return "TetraedroRegular{" + "lado=" + lado + '}';
    }

    
}
