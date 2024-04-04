package domain.Alumno;

import domain.materia.Materia;
import java.util.List;

public class Alumno {
    private Legajo legajo;
    private String nombre;
    private String apellido;
    private List<Materia> materiasAprobadas;

    public Alumno(Legajo legajo, String nombre) {
        this.legajo = legajo;
        this.nombre = nombre;
    }
    public void agregarMateriasAprobadas(Materia unaMateria){
        materiasAprobadas.add(unaMateria);
    }
    public boolean cumpleCorrelativas(Materia unaMateria){
        boolean tieneLasCorrelativas = materiasAprobadas.containsAll(unaMateria.getCorrelativas());
        return tieneLasCorrelativas;
    }

}
