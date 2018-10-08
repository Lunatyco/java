
package cl.inacap.tids02.evrecuperativa.dominio;

public class Libro extends Stock {

    private String isbn;
    private String titulo;
    private String autor;

    public Libro(String isbn, String titulo, String autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public void setCantidadDisponible(int cantidadDisponible) {
        super.setCantidadDisponible(cantidadDisponible); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getCantidadDisponible() {
        return super.getCantidadDisponible(); //To change body of generated methods, choose Tools | Templates.
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
}
