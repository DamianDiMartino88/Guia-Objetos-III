package com.Circulo;

public class Cilindro extends Circulo {
    private double altura;

    public Cilindro() {
        super();
        this.altura = 1.0;
    }

    public Cilindro(double radio, String color, double altura) {
        super(radio, color);
        this.altura = altura;
    }


    public double calcularArea() {
         return ((2*3.14*this.getRadio()*this.altura) + (2*super.calcularArea()));
    }

    public double calcularAreaBase(){
        return super.calcularArea();
    }
    public double volumenCilindro(){
        return (3.14*(Math.pow(this.getRadio(),2))*this.altura);
    }

    public String toString()
    {
        return "Cilindro Subclase de:"+super.toString()+" Altura: "+this.altura;
    }
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
