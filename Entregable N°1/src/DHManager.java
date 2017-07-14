import java.util.ArrayList;
import java.util.List;

/**
 * Created by dh1 on 06/04/17.
 */
public class DHManager {
    //Atributos:
    private List<Alumno> alumnos = new ArrayList<>();
    private List<Profesor> profesores = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();
    private List<Inscripcion> inscripciones = new ArrayList<>();


    //Metodos:
    public void altaCurso(String nombre, Integer codigoCurso, Integer cupoMaximo){
        Curso unCurso = new Curso(nombre, codigoCurso, cupoMaximo);
        cursos.add(unCurso);
        System.out.println("Se dio de alta al "+unCurso.toString());
    }

    public void bajaCurso(Integer codigoCurso){
        List<Curso> auxCursos = new ArrayList<>();
        for(Curso curso : cursos){
            if(!curso.equals(codigoCurso)){
                auxCursos.add(curso);
            } else {
                System.out.println("Se elimino el curso: "+curso.toString());
            }
        }
        cursos = auxCursos;
    }

    public void altaProfesorAdjunto(String nombre, String apellido, Integer codigoProfesor, Integer cantDeHoras){
        Profesor unProfesorAdjunto = new ProfesorAdjunto (nombre, apellido, codigoProfesor, cantDeHoras);
        profesores.add(unProfesorAdjunto);
        System.out.println("Se dio de alta a "+unProfesorAdjunto.toString());
    }

    public void altaProfesorTitular(String nombre, String apellido, Integer codigoProfesor, String especialidad){
        Profesor unProfesorTitular = new ProfesorTitular(nombre, apellido, codigoProfesor, especialidad);
        profesores.add(unProfesorTitular);
        System.out.println("Se dio de alta a "+unProfesorTitular.toString());
    }

    public void bajaProfesor(Integer codigoProf){
        List<Profesor> auxProfesores = new ArrayList<>();
        for(Profesor unProf: profesores){
            if(!unProf.getCodigoDeProfesor().equals(codigoProf)){
                auxProfesores.add(unProf);
            } else {
                System.out.println("Se dio de baja a: "+unProf.toString());
            }
        }
        profesores = auxProfesores;
    }

    public void altaAlumno(String nombre, String apellido, Integer codigoAlumno){
        Alumno unAlumno = new Alumno(nombre, apellido, codigoAlumno);
        alumnos.add(unAlumno);
        System.out.println("Se dio de alta a "+unAlumno.toString());
    }

    public void inscribirAlumno(Integer codigoAlumno, Integer codigoCurso){
        for(Curso curso : cursos){
            if(curso.getCodigoDeCurso().equals(codigoCurso)){
                for(Alumno alumno : alumnos){
                    if(alumno.getCodigoDeAlumno().equals(codigoAlumno)){
                        if(curso.agregarAlumno(alumno) == true){
                            //curso.agregarAlumno(alumno);
                            Inscripcion unaInscripcion = new Inscripcion(alumno, curso);
                            inscripciones.add(unaInscripcion);
                        }
                    }
                }
            }
        }
    }

    public void asignarProfesores(Integer codigoCurso, Integer codigoProfTitular, Integer codigoProfAdjunto){
        for(Curso curso : cursos){
            if(curso.getCodigoDeCurso().equals(codigoCurso)){
                for(Profesor prof : profesores){
                    if(prof.getCodigoDeProfesor().equals(codigoProfTitular) && curso.getUnProfesorTitular() != null){
                        curso.setUnProfesorTitular(prof);//Agrego al profesor tirular.
                        System.out.println("Se agrego a "+prof.toString()+" al curso "+curso.toString());
                    }
                    if(prof.getCodigoDeProfesor().equals(codigoProfAdjunto) && curso.getUnProfesorAdjunto() != null){
                        curso.setUnProfesorAdjunto(prof);//Agrego al profesor adjunto.
                        System.out.println("Se agrego a "+prof.toString()+" al curso "+curso.toString());
                    }
                }
            }
        }
    }
}
