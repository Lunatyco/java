package cl.inacap.tids02.tarea2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Clinica> clinicas = new ArrayList<>();
        /*
        List<Persona> personas = new ArrayList<>();
        */
        List<Paciente> pacientes = new ArrayList<>();
        boolean salirDeAqui = false;
        do {            
            System.out.println("Ingrese una de las siguientes opciones: ");
            System.out.println("1) Agregar Clinica");
            System.out.println("2) Agregar Paciente");
            System.out.println("3) Mostrar Clinicas");
            System.out.println("4) Mostrar Pacientes");
            System.out.println("5) Agregar Paciente a Clinica");
            System.out.println("6) Imprimir listado de Pacientes en las Clinicas");
            System.out.println("7) Salir");
            int opcion = teclado.nextInt();
            teclado.nextLine(); switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre de la Clinica:");
                    String nombreClinica = teclado.nextLine();
                    System.out.println("Ingrese la direccion de la Clinica");
                    String direccion = teclado.nextLine();
                    clinicas.add(new Clinica(nombreClinica, direccion));
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del paciente.");
                    String nombrePersona = teclado.nextLine();
                    System.out.println("Ingrese el apellido del paciente");
                    String apellidoPersona = teclado.nextLine();
                    pacientes.add(new Paciente(nombrePersona,apellidoPersona));
                    break;
                case 3:
                    for (Clinica clinica: clinicas) {
                        if (clinica != null) {
                            System.out.println(clinica.getNombreClinica());
                        }
                    }
                    if (clinicas.isEmpty()) {
                        System.out.println("No se ha ingresado ninguna Clinica.");
                    }
                    break;
                case 4:
                    for (Paciente paciente : pacientes) {
                        if (paciente != null) {
                            System.out.println( paciente.getNombrePersona() + " " 
                                    + paciente.getApellidoPersona());
                        }
                    }
                    if (pacientes.isEmpty()) {
                        System.out.println("No se ha ingresado ningún paciente.");
                    }
                    break;
                case 5:
                    System.out.println("Ingrese el nombre del paciente");
                    String nombrePaciente = teclado.nextLine();
                    Paciente pacienteBuscando = null;
                    for(Paciente paciente: pacientes){
                        if(paciente.getNombrePersona().equalsIgnoreCase(nombrePaciente)){
                            pacienteBuscando = paciente;
                        }
                    }
                    
                    if(pacienteBuscando == null){
                        System.out.println("El paciente no ha sido encontrado.");
                        break;
                    }
                    
                    System.out.println("Ingrese el nombre de la clinica");
                    nombreClinica = teclado.nextLine();
                    for(Clinica clinica: clinicas){
                        if(clinica.getNombreClinica().equalsIgnoreCase(nombreClinica)){
                            clinica.agregarPaciente(pacienteBuscando);
                            System.out.println("El paciente ha sido asignado a la clinica.");
                        }
                    }                   
                    break;
                case 6:
                    System.out.println("Ingrese el nombre de la Clinica");
                    String nombreClinica1 = teclado.nextLine();
                    for(Clinica clinica: clinicas){
                        if(clinica.getNombreClinica().equalsIgnoreCase(nombreClinica1)){
                            clinica.imprimirListadoPaciente();
                        }
                    }
                    break;
                case 7:
                    salirDeAqui = true;
                default:
                    System.out.println("La opcion ingresada no es válida.");
            }
        } while (!salirDeAqui);
    }
}
