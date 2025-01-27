
package model;

/**
 *
 * @author Leonardo
 */
public class Curso {
    private String nombre;
    private int añosExperiencia;

    public Curso(String nombre, int añosExperiencia) {
        this.nombre = nombre;
        this.añosExperiencia = añosExperiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    @Override
    public String toString() {
       return "Curso: " + nombre + ", Años de experiencia requeridos: " + añosExperiencia;
    }
    
}
