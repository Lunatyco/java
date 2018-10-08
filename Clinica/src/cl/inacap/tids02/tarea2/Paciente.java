package cl.inacap.tids02.tarea2;

public class Paciente extends Persona{
    private String prevision;

    public Paciente(String nombrePersona, String apellidoPersona) {
        super(nombrePersona, apellidoPersona);
    }
    
    public String getPrevision() {
        return prevision;
    }

    public void setPrevision(String prevision) {
        this.prevision = prevision;
    }

    
    
}
