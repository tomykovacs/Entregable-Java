/**
 * Created by dh1 on 06/04/17.
 */
public class ProfesorTitular extends Profesor {
    private String especialidad;

    public ProfesorTitular(String nombre, String apellido, Integer codigoDeProfesor, String unaEspecialidad) {
        super(nombre, apellido, codigoDeProfesor);
        especialidad = unaEspecialidad;
        setAntiguedad(0);
    }

    @Override
    public String toString() {
        return "Profesor Titular: " + "especialidad: "+especialidad+" , nombre: "+getNombre()+ ", apellido: "+getApellido()+", codigo: "+getCodigoDeProfesor();
    }

}
