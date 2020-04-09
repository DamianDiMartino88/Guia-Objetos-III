package com.PersonalColegio;

public class Persona {
    private int dni;
    private String nombre;
    private String apellido;
    private String email;
    private String direccion;

    public Persona()
    {
        this.dni=00000000;
        this.nombre="";
        this.apellido="";
        this.email="";
        this.direccion="";
    }

    public Persona(int dni, String nombre, String apellido, String email, String direccion)
    {
        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apellido;
        this.email=email;
        this.direccion=direccion;
    }

    public String toString(){
        return "Nombre: "+this.nombre+", Apellido: "+this.apellido+", DNI: "+
                this.dni+", E-Mail: "+this.email+", Direccion"+this.direccion;
    }




}
