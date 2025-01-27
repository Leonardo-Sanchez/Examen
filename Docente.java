
package model;

/**
 *
 * @author Leonardo
 */
public class Docente extends Persona {
    private int año_expe;

    public Docente(int año_expe, String nombre, String fecha_nacim) {
        super(nombre, convertirFecha(fecha_nacim));
        this.año_expe = año_expe;
    }

    public int getAño_expe() {
        return año_expe;
    }

    private static Fecha convertirFecha(String fecha_nacim) {
        String[] partes = fecha_nacim.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int año = Integer.parseInt(partes[2]);
        return new Fecha(dia, mes, año);
    }

    @Override
    public String toString() {
        return super.toString() + ", Años de Experiencia: " + año_expe;
    }
}
