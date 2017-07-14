/**
 * Created by dh1 on 06/04/17.
 */
public class Profesor {
    private String nombre;
    private String apellido;
    private Integer antiguedad;
    private Integer codigoDeProfesor;


    public Profesor(String nombre, String apellido, Integer codigoDeProfesor) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoDeProfesor = codigoDeProfesor;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", antiguedad=" + antiguedad +
                ", codigoDeProfesor=" + codigoDeProfesor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Profesor otroProfesor = (Profesor)o;
        if(this.getCodigoDeProfesor().equals(otroProfesor.getCodigoDeProfesor())){
            return true;
        } else {
            return false;
        }
    }

    //Getters y Setters:
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Integer getCodigoDeProfesor() {
        return codigoDeProfesor;
    }

}
