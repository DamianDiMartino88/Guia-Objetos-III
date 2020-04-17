package com.Circulo;

public class Circulo {
    private double radio;
    private String color;

    public Circulo(){

        this.radio=1.0;
        this.color="Rojo";
    }

    public Circulo(double radio, String color){

        this.radio=radio;
        this.color=color;
    }

    public Circulo(double radio){

        this.radio=radio;

    }


    public double calcularPerimetro(){
        return (2*Math.PI*this.radio);
    }
    public double calcularArea(){
        return ((Math.PI)*Math.pow(this.radio,2));
    }
    public double longitudCirculo(){
        return(2*Math.PI*this.radio);
    }

    public void caracteristicasCirculo()
    {
        System.out.println("El Circulo tiene un radio de "+this.radio+" es de color "+this.color+" y tiene un area de "+this.calcularArea());
    }

    @Override
    public String toString()
    {
        return "Circulo";
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
