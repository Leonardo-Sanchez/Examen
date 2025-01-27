package model;

/**
 *
 * @author Leonardo
 */
public class CursoAperturado {
        
    private String nombre_curso;

    public CursoAperturado(String nombre_curso) {
        this.nombre_curso = nombre_curso;
    }

    public CursoAperturado() {
        this.nombre_curso = "Java Programacion";
    }

    @Override
    public String toString() {
        return "Curso Aperturado: " + nombre_curso; 
    }
        
}
