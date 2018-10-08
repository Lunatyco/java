package cl.inacap.tids02.evrecuperativa.dominio;

import cl.inacap.tids02.evrecuperativa.dominio.*;
import java.util.ArrayList;
import java.util.List;

public class Libreria extends Sucursal {
    private  List<Libro> libros = new ArrayList<>();

    public Libreria(String direccion) {
        super(direccion);
    }

    public void agregarLibro(Libro libro){
        libros.add(libro);
    }

    @Override
    public String getDireccion() {
        return super.getDireccion(); //To change body of generated methods, choose Tools | Templates.
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
   
}
