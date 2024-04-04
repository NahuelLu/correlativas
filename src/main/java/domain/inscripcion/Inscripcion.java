package domain.inscripcion;

import domain.Alumno.Alumno;
import domain.materia.Materia;
import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materiasAInscribir;

    public Inscripcion(Alumno alumno, List<Materia> materiasAInscribir) {
        this.alumno = alumno;
        this.materiasAInscribir = materiasAInscribir;
    }

    public boolean aprobada(){
        return materiasAInscribir
                .stream()
                .allMatch(materia -> alumno.cumpleCorrelativas(materia));
    }
}
