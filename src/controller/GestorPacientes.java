package controller;

import modelo.Paciente;

public class GestorPacientes {

    private Paciente[] pacientes;
    private int cantidad;

    public GestorPacientes(int max) {
        pacientes = new Paciente[max];
        cantidad = 0;
    }

    public void registrarPaciente(Paciente p) {
        if (cantidad < pacientes.length) {
            pacientes[cantidad] = p; //(Sdocumento, StipoDocumento, Snombres, Sapellidos, SfechaNacimiento, 
            cantidad++; //                    Ssexo, Stelefono, Semail, ScontactoEmergencia)
        }
    }

    public Paciente buscarPorDocumento(String documento) {
        for (int i = 0; i < cantidad; i++) {
            if (pacientes[i].getDocumento().equals(documento)) {
                return pacientes[i];
            }
        }
        return null;
    }

    public void listarPacientes() {
        for (int i = 0; i < cantidad; i++) {
            System.out.println(pacientes[i].verResumen());
        }
    }

}
