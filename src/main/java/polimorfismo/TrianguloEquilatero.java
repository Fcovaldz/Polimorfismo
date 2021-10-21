/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;


public abstract class TrianguloEquilatero extends FiguraBidimensional {
private double lado;
    public TrianguloEquilatero(int lados, double perimetro) {
        super(lados, perimetro);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = 10;
    }

   @Override
    public double area() {
        
         return area = lado*lado/2;
        
    }
    @Override
    public double perimetro() {
       
         return perimetro = lado*3;
        
    }
    
    @Override
    public String toString() {
        return "TrianguloEquilatero{" + "lado=" + lado + '}';
    }
    
}
