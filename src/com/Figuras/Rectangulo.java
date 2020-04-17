package com.Figuras;

public class Rectangulo {
    private double base;
    private double altura;
    public String color;


    public Rectangulo(){
        super();
        this.base=0;
        this.altura=0;
        this.color="";
    }

    public Rectangulo(double base, double altura, String color){
        this.base=base;
        this.altura=altura;
        this.color=color;
    }
    public Rectangulo(double base, double altura){
        this.base=base;
        this.altura=altura;
        this.color="";
    }

    public double calcularArea(){
        return (this.base*this.altura);
    }

    public double calcularPerimetro(){
        return (2*(this.base+this.altura));
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


}
