package domain;

import domain.Alumno.Alumno;
import domain.Alumno.Legajo;
import domain.inscripcion.Inscripcion;
import domain.materia.Materia;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class InscripcionTest {

    @Test
    public void unaInscripcionConCorrelativasCorrectas(){
        Materia am1 = new Materia("AM1");
        Materia algebra = new Materia("ALGEBRA");
        Materia am2 = new Materia("AM2");
        Legajo legajo = new Legajo(12);
        Alumno nahuel = new Alumno(legajo, "Nahuel");
        ArrayList<Materia> materiasAprobadas = new ArrayList<>();
        materiasAprobadas.add(algebra);
        materiasAprobadas.add(am1);
        nahuel.agregarMateriasAprobadas(materiasAprobadas);
        ArrayList<Materia> materiasInscribirse = new ArrayList<>();
        materiasInscribirse.add(am2);
        Inscripcion unaInscripcion = new Inscripcion(nahuel,materiasInscribirse);
    }

}
