import java.util.ArrayList;
import java.util.List;

/**
 * Created by dh1 on 06/04/17.
 */
public class Curso {
    //Atributos:
    private String nombre;
    private Integer codigoDeCurso;
    private Profesor unProfesorTitular;
    private Profesor unProfesorAdjunto;
    private List<Alumno> alumnos = new ArrayList<>();
    private Integer cupoMaximo;

    //Metodos:
    public Boolean agregarAlumno(Alumno unAlumno){
        if(alumnos.size() < cupoMaximo){
            alumnos.add(unAlumno);
            System.out.println("Se agrego a "+unAlumno.toString()+" al curso "+ this.toString());
            return true;
        } else {
            System.out.println("No se pudo inscribir al alumno porque el cupo de alumnos esta lleno");
            return false;
        }
    }

    public void eliminarAlumno(Alumno unAlumno){
        List<Alumno> auxAlumnos = new ArrayList<>();
        for(Alumno alumno : alumnos){
            if(!alumno.equals(unAlumno)){
                auxAlumnos.add(alumno);
            } else {
                System.out.println("Se elimino a: "+unAlumno.toString());
            }
        }
        alumnos = auxAlumnos;
    }

    @Override
    public String toString() {
        return nombre+", codigo de curso: " + codigoDeCurso;
    }

    //Constructor:
    public Curso(String nombre, Integer codigoDeCurso, Integer cupoMaximo) {
        this.nombre = nombre;
        this.codigoDeCurso = codigoDeCurso;
        this.cupoMaximo = cupoMaximo;
    }

    @Override
    public boolean equals(Object o) {
        Curso otroCurso = (Curso)o;
        if(this.getCodigoDeCurso().equals(otroCurso.getCodigoDeCurso())){
            return true;
        } else {
            return false;
        }
    }

    public Profesor getUnProfesorTitular() {
        return unProfesorTitular;
    }

    public Profesor getUnProfesorAdjunto() {
        return unProfesorAdjunto;
    }

    public void setUnProfesorTitular(Profesor unProfesorTitular) {
        this.unProfesorTitular = unProfesorTitular;
    }

    public void setUnProfesorAdjunto(Profesor unProfesorAdjunto) {
        this.unProfesorAdjunto = unProfesorAdjunto;
    }

    public Integer getCodigoDeCurso() {
        return codigoDeCurso;
    }

}
