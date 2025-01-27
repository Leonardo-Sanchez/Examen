
package model;


/**
 *
 * @author Leonardo
 */
public class Alumno extends Persona {
    public Alumno(String nombre, String fecha_nacim) {
        super(nombre, convertirFecha(fecha_nacim));
    }

    private static Fecha convertirFecha(String fecha_nacim) {
        String[] partes = fecha_nacim.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int año = Integer.parseInt(partes[2]);
        return new Fecha(dia, mes, año);
    }
}

