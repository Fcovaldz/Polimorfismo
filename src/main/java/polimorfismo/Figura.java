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
public abstract class Figura {
    
    protected String nombre;
    protected String color;
    double area;
    public abstract double area();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
      public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
  

    @Override
    public String toString() {
        return "Figura{" + "nombre=" + nombre + ", color=" + color + ", area=" + area + '}';
    }

}
