package cl.inacap.tids02.tarea2;

public class Persona {
    private String nombrePersona;
    private String apellidoPersona;

    public Persona(String nombrePersona, String apellidoPersona) {
        this.nombrePersona = nombrePersona;
        this.apellidoPersona = apellidoPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }
    
    
}
