package cl.inacap.tids02.dominio;

import java.util.List;
import java.util.ArrayList;

public class Departamento {
    private String nombre;
    private List<Profesor> profesores = new ArrayList<>();

    public Departamento(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
