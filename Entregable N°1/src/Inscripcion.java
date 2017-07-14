import java.util.Date;

/**
 * Created by dh1 on 06/04/17.
 */
public class Inscripcion {
    private Alumno alumno;
    private Curso curso;
    //private Date fechaDeInscripcion;


    public Inscripcion(Alumno unAlumno, Curso unCurso) {
        alumno = unAlumno;
        curso = unCurso;
        Date fechaDeInscripcion = new Date();
        System.out.println("Inscripcion realizada");
    }
}
