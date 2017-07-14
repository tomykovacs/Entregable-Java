/**
 * Created by dh1 on 06/04/17.
 */
public class ProfesorAdjunto extends Profesor {
    private Integer horasDedicadasAConsulta;

    public ProfesorAdjunto(String nom, String ape, Integer codigoProf, Integer cantHoras){
        super(nom, ape, codigoProf);
        horasDedicadasAConsulta = cantHoras;
        setAntiguedad(0);
    }

    @Override
    public String toString() {
        return "Profesor Adjunto: " + "horas de consulta: "+horasDedicadasAConsulta+" , nombre: "+getNombre()+ ", apellido: "+getApellido()+", codigo: "+getCodigoDeProfesor();
    }

}
