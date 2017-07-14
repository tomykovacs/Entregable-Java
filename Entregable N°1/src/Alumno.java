/**
 * Created by dh1 on 06/04/17.
 */
public class Alumno {
    private String nombre;
    private String apellido;
    private Integer codigoDeAlumno;


    public Alumno(String nombre, String apellido, Integer codigoDeAlumno) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoDeAlumno = codigoDeAlumno;
    }



    @Override
    public boolean equals(Object o) {
        Alumno otroAlumno = (Alumno)o;
        if(this.getCodigoDeAlumno().equals(otroAlumno.getCodigoDeAlumno())){
            return true;
        } else {
            return false;
        }
    }

    public Integer getCodigoDeAlumno() {
        return codigoDeAlumno;
    }

    @Override
    public String toString() {
        return "" + nombre + " " + apellido + ", codigo de alumno: " + codigoDeAlumno;
    }
}
