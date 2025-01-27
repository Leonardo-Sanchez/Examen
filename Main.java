package controller;
import model.*;

/**
 *
 * @author Leonardo
 */
public class Main {
    public static void main(String[] args){
        
        System.out.println("Alumnos :");
        Alumno a1= new Alumno("Rodrigo", "9/06/2000");
        Alumno a2 = new Alumno("Leonardo", "31/07/1998"); 
        System.out.println(a1);
        System.out.println(a2);
        System.out.println("Docentes: ");
        Docente d1= new Docente(7,"Bertha", "11/07/1974");
        Docente d2 = new Docente(10,"Marco", "26/06/1968");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println("Curso Aperturado: ");
        Curso c1= new Curso("Java Programacion", 4);
        System.out.println(c1);
        
        Matricula m1 = new Matricula(a1, c1);
        Matricula m2 = new Matricula(a2, c1);
        
        System.out.println("\nMatriculas:");
        System.out.println(m1);
        System.out.println(m2);
        
        // Validación de edad
        int edad1 = calcularEdad(a1.getFecha_nacim());
        int edad2 = calcularEdad(a2.getFecha_nacim());

        if (edad1 >= 18) {
            System.out.println(a1.getNombre() + " es mayor de edad");
        } else {
            System.out.println(a1.getNombre() + " no cumple con la mayoría de edad");
        }

        if (edad2 >= 18) {
            System.out.println(a2.getNombre() + " es mayor de edad");
        } else {
            System.out.println(a2.getNombre() + " no cumple con la mayoría de edad");
        }

        // Validación de experiencia docente
        cumpleExperiencia(d1, c1);
        cumpleExperiencia(d2, c1);
    }

    private static int calcularEdad(Fecha fechaNacimiento) {
        int añoActual = 2025; 
        int mesActual = 1;    
        int diaActual = 26;   

        int edad = añoActual - fechaNacimiento.getAño();

        if (mesActual < fechaNacimiento.getMes() ||
            (mesActual == fechaNacimiento.getMes() && diaActual < fechaNacimiento.getDia())) {
            edad--;
        }

        return edad;
    }

    private static void cumpleExperiencia(Docente d, Curso c) {
        if (d.getAño_expe() >= c.getAñosExperiencia()) {
            System.out.println(d.getNombre() + " puede enseñar el curso " + c.getNombre());
        } else {
            System.out.println(d.getNombre() + " no cumple con los requisitos para el curso " + c.getNombre());
        }
    }
}
