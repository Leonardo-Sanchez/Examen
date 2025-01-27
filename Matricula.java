
package model;

/**
 *
 * @author Leonardo
 */
public class Matricula {
    private Alumno alumno;
    private Curso curso;

    public Matricula(Alumno alumno, Curso curso) {
        this.alumno = alumno;
        this.curso = curso;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Matricula: Alumno: " + alumno.getNombre() + ", Curso: " + curso.getNombre();
    }
    }
    

