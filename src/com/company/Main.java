package com.company;

import com.Circulo.Cilindro;
import com.Circulo.Circulo;
import com.Figuras.Cuadrado;
import com.Figuras.Rectangulo;
import com.PersonalColegio.Persona;
import com.PersonalColegio.Estudiante;
import com.PersonalColegio.Staff;

public class Main {

    public static void main(String[] args) {

        //Ejercicio 1

        Cilindro cilindro = new Cilindro();

        System.out.println("Radio del Cilindro: "+cilindro.getRadio());
        System.out.println("Altura del Cilindro: "+cilindro.getAltura());
        System.out.println("Area de la Base del Cilindro: "+cilindro.calcularAreaBase());
        System.out.println("Volumen del Cilindro: "+cilindro.volumenCilindro());

        Cilindro cilindro2 = new Cilindro(7.15,"Azul",5.23);

        System.out.println("Area del Cilindro: "+cilindro2.calcularArea());
        System.out.println("Volumen del Cilindro: "+cilindro2.volumenCilindro());
        System.out.println("Area de la Base del Cilindro: "+cilindro2.calcularAreaBase());

        System.out.println(cilindro2.toString());

        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println();

        //Ejercicio 2

        Estudiante estudiante1 =new Estudiante(12345678,"Juan","Perez","juanperez@mimail.com","Calle Falsa 123",2018,3525.87,"Automotores");
        Estudiante estudiante2 =new Estudiante(87654321,"Jose","Garcia","josegarcia@mimail.com","Avenida SiempreViva 321",2019,2487.15,"Electronica");
        Estudiante estudiante3 =new Estudiante(56781234,"Maria","Gonzalez","mariagonzalez@mimail.com","De la Via 4458",2017,2236.63,"Quimica");
        Estudiante estudiante4 =new Estudiante(43218765,"Micaela","Rodriguez","micaelarodriguez@mimail.com","De Aca A La Vuelta 2254",2018,2987.28,"Informatica");

        Staff staff1 = new Staff(1125465,"Miguel","Angel","miguelangel@mimail.com","David 6543",25554.2,"Mañana","Biologia");
        Staff staff2 = new Staff(1125465,"Pablo","Picasso","pablopicasso@mimail.com","Guernica 5547",20335.15,"Tarde","Ciencias Sociales");
        Staff staff3= new Staff(1125465,"Vincent","Van Gogh","vincentvangogh@mimail.com","La Noche Estrellada 887",28847.98,"Noche","Quimica");
        Staff staff4 = new Staff(1125465,"Salvador","Dali","salvadordali@mimail.com","La Persistencia De La Memoria 6543",23254.54,"Mañana","Fisica");

        Persona[] arregloDePersonas = new Persona[8];

        arregloDePersonas[0]=estudiante1;
        arregloDePersonas[1]=staff1;
        arregloDePersonas[2]=estudiante2;
        arregloDePersonas[3]=staff2;
        arregloDePersonas[4]=estudiante3;
        arregloDePersonas[5]=staff3;
        arregloDePersonas[6]=estudiante4;
        arregloDePersonas[7]=staff4;
        int estudiantes=0, staff=0;
        double ingresoMensual=0;
        for (Object o: arregloDePersonas) {
            if(o instanceof Estudiante)
            {
                estudiantes++;
                ingresoMensual+=((Estudiante) o).getCuotaMensual();
            }else
            {
                staff++;
            }
        }
        System.out.println("Estudiantes: "+estudiantes);
        System.out.println("Staff      : "+staff);
        System.out.println("Ingreso Mensual: "+ingresoMensual);

        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println();

        //Ejercicio 3

        Circulo circulo1 = new Circulo(5.3,"Rojo");
        Circulo circulo2 = new Circulo(4);

        Rectangulo rectangulo1 = new Rectangulo(2.4,4.7,"Azul");
        Rectangulo rectangulo2 = new Rectangulo(5.4,3.2);

        System.out.println("Area Del Circulo 1: "+circulo1.calcularArea());
        System.out.println("Perimetro Del Circulo 1: "+circulo1.calcularPerimetro());
        if(!circulo1.getColor().equals(""))
        {
            System.out.println("Color Del Circulo 1: "+circulo1.getColor());
        }
        System.out.println("Area Del Circulo 2: "+circulo2.calcularArea());
        System.out.println("Perimetro Del Circulo2: "+circulo2.calcularPerimetro());
        if(!rectangulo1.getColor().equals(""))
        {
            System.out.println("Color Del Rectangulo 1: "+rectangulo1.getColor());
        }
        System.out.println("Area Del Rectangulo 1: "+rectangulo1.calcularArea());
        System.out.println("Perimetro Del Rectagulo 1: "+rectangulo1.calcularPerimetro());
        if(!rectangulo2.getColor().equals(""))
        {
            System.out.println("Color Del Rectangulo 2: "+rectangulo2.getColor());
        }
        System.out.println("Area Del Rectangulo 2: "+rectangulo2.calcularArea());
        System.out.println("Perimetro Del Rectangulo 2: "+rectangulo2.calcularPerimetro());

        Cuadrado cuadrado1 = new Cuadrado(2.4,"Verde");
        Cuadrado cuadrado2 = new Cuadrado(7.3);

        if(!cuadrado1.getColor().equals(""))
        {
            System.out.println("Color Del Cuadrado 1: "+cuadrado1.getColor());
        }
        System.out.println("Area Del Cuadrado 1: "+cuadrado1.calcularArea());
        System.out.println("Perimetro Del Cuadrado 1: "+cuadrado1.calcularPerimetro());
        if(!cuadrado2.getColor().equals(""))
        {
            System.out.println("Color Del Cuadrado 2: "+cuadrado2.getColor());
        }
        System.out.println("Area Del Cuadrado 2: "+cuadrado2.calcularArea());
        System.out.println("Perimetro Del Cuadrado 2: "+cuadrado2.calcularPerimetro());

    }
}
