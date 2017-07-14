public class Main {

    public static void main(String[] args) {
        //Tomás Kovacs
        DHManager manager = new DHManager();

        manager.altaCurso("Full Stack", 20001, 3);
        manager.altaCurso("Android", 20002, 2);

        manager.altaProfesorTitular("Pedro", "Wakim", 1, "Andoird");
        manager.altaProfesorTitular("Juan", "Perez", 2, "Web");

        manager.altaProfesorAdjunto("Pablo", "Lopez", 3, 6);
        manager.altaProfesorAdjunto("Jose", "Rodriguez", 4, 6);

        manager.asignarProfesores(20002, 1, 3);
        manager.asignarProfesores(20001, 2, 4);

        manager.altaAlumno("Tomas", "Kovacs", 1);
        manager.altaAlumno("Santiago", "Kovacs", 2);
        manager.altaAlumno("Sofia", "Kovacs", 3);

        manager.inscribirAlumno(2, 20001);
        manager.inscribirAlumno(3, 20001);

        manager.inscribirAlumno(1, 20002);
        manager.inscribirAlumno(2, 20002);

        manager.inscribirAlumno(1, 20002);
        manager.inscribirAlumno(2, 20002);
        manager.inscribirAlumno(3, 20002);

        /*PARTE K: en la clase Curso crearía un método para preguntar si el curso contiene un alumno y un metodo en la clase
        DHManager que recurra todos los cursos y vaya preguntando si el curso contiene al alumno en cuestion, de tenerlo, se imprime
        el nombre del curso (obviamente lo mismo con todos los cursos en los que se encuentre el alumno).
        Tambien se podria agregar un atributo cursos en la clase alumno pero habria que modificar mas cosas.
         */
    }
}
