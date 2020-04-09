package com.Figuras;

public class Cuadrado extends Rectangulo {

    public Cuadrado()
    {
        super();
    }

    public Cuadrado(double lado)
    {
        super(lado,lado);
    }

    public Cuadrado(double lado, String color)
    {
        super(lado,lado, color);
    }
}
