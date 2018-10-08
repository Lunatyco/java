package cl.inacap.tids02.tarea2;

import java.util.ArrayList;
import java.util.List;

public class Clinica extends Edificio{
    private String nombreClinica;
    List<Paciente> pacientes = new ArrayList<>();

    public Clinica(String nombreClinica,String direccion) {
        super(direccion);
        this.nombreClinica=nombreClinica;
    }
    public void agregarPaciente(Paciente paciente){
        pacientes.add(paciente);
    }
    
    public void imprimirListadoPaciente(){
        for(Paciente paciente : pacientes){
            if(pacientes != null){
                System.out.println("El nombre del Paciente es " + paciente.getNombrePersona() + 
                        " " + paciente.getApellidoPersona());
            }
        }
    }

    public String getNombreClinica() {
        return nombreClinica;
    }
    
}
