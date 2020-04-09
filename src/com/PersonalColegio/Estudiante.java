package com.PersonalColegio;

public class Estudiante extends Persona {
    private int anioIngreso;
    private double cuotaMensual;
    private String carrera;

    public Estudiante()
    {
        super();
        this.anioIngreso=0000;
        this.cuotaMensual=0.0;
        this.carrera="";
    }

    public Estudiante(int dni, String nombre, String apellido, String email, String direccion, int anioIngreso, double cuotaMensual, String carrera)
    {
        super(dni,nombre,apellido,email,direccion);
        this.anioIngreso=anioIngreso;
        this.cuotaMensual=cuotaMensual;
        this.carrera=carrera;
    }

    public double cuotaAnual(){
        return (this.cuotaMensual*12);
    }

    public String toString(){
        return "Estudiante: "+super.toString()+", Año de Ingreso: "+this.anioIngreso+", Estudia: "+
                this.carrera+", Con un Valor Mensual de: $"+this.cuotaMensual+" Y Anual de : $"+this.cuotaAnual();
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
