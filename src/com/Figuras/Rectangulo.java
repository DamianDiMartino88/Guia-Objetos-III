package com.Figuras;

public class Rectangulo {
    private double Base;
    private double Altura;
    public String color;


    public Rectangulo(){
        super();
        this.Base=0;
        this.Altura=0;
        this.color="";
    }

    public Rectangulo(double base, double altura, String color){
        this.Base=base;
        this.Altura=altura;
        this.color=color;
    }
    public Rectangulo(double base, double altura){
        this.Base=base;
        this.Altura=altura;
        this.color="";
    }

    public double calcularArea(){
        return (this.Base*this.Altura);
    }

    public double calcularPerimetro(){
        return (2*(this.Base+this.Altura));
    }

    public double getBase() {
        return Base;
    }

    public void setBase(double base) {
        Base = base;
    }

    public double getAltura() {
        return Altura;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAltura(double altura) {
        Altura = altura;
    }


}
