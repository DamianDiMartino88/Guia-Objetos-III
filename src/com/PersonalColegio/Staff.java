package com.PersonalColegio;

public class Staff extends Persona{
    private double salario;
    private String turno;
    private String materia;

    public Staff(){
        super();
        this.salario=0.0;
        this.turno="";
        this.materia="";
    }

    public Staff(int dni, String nombre, String apellido, String email, String direccion, double salario, String turno, String materia){
        super(dni,nombre,apellido,email,direccion);
        this.salario=salario;
        this.turno=turno;
        this.materia=materia;
    }

    public double salarioAnual(){
        return (this.salario*12);
    }

    public String toString(){
        return "Miembro del Staff: "+super.toString()+", Enseña en el Turno: "+this.turno+", La Materia: "+
                this.materia+", Con un Valor Salario Mensual de: $"+this.salario+" Y Anual de : $"+this.salarioAnual();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
