package cl.inacap.tids02.evrecuperativa.dominio;

public class Sucursal {

    private String direccion;

    public Sucursal(String direccion) {
        this.direccion = direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
     

    public String getDireccion() {
        return direccion;
    }
    
}
