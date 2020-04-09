package com.Circulo;

public class Circulo {
    private double Radio;
    private String color;

    public Circulo(){

        this.Radio=1.0;
        this.color="Rojo";
    }

    public Circulo(double radio, String color){

        this.Radio=radio;
        this.color=color;
    }

    public Circulo(double radio){

        this.Radio=radio;

    }


    public double calcularPerimetro(){
        return (2*3.14*this.Radio);
    }
    public double calcularArea(){
        return ((3.14)*Math.pow(this.Radio,2));
    }
    public double longitudCirculo(){
        return(2*3.14*this.Radio);
    }

    public void caracteristicasCirculo()
    {
        System.out.println("El Circulo tiene un radio de "+this.Radio+" es de color "+this.color+" y tiene un area de "+this.calcularArea());
    }

    public String toString()
    {
        return "Circulo";
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double radio) {
        Radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
