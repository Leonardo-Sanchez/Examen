
package model;

/**
 *
 * @author Leonardo
 */
public class Persona {
    private String nombre;
    private Fecha fecha_nacim;

    public Persona(String nombre, Fecha fecha_nacim) {
        this.nombre = nombre;
        this.fecha_nacim = fecha_nacim;
    }

    public String getNombre() {
        return nombre;
    }

    public Fecha getFecha_nacim() {
        return fecha_nacim;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Fecha de Nacimiento: " + fecha_nacim;
    }
}
