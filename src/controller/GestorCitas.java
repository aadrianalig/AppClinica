package controller;

import modelo.Cita;
import modelo.Consultorio;
import modelo.Empleado;
import modelo.Paciente;

public class GestorCitas {

    private Cita[] citas;
    private int cantidad;

    public GestorCitas(int max) {
        citas = new Cita[max];
        cantidad = 0;
    }

    public boolean validarDisponibilidad(Empleado medico, Consultorio consul,
                                                 String fecha, String hora) {
        // Recorre todas las citas que ya estan en el sistema
        for (int i = 0; i < cantidad; i++) {
            Cita c = citas[i];
            // Compara la cita(i) con la fecha y hora de la nueva cita solicitada.
            if (c.getFecha().equals(fecha) && c.getHora().equals(hora)) { //compara horas y fecha
                if (c.getMedico() == medico) { // compara medico
                    return false;   // ----> el medico esta ocupado
                }
                // Revisa si esta ocupado el consultorio a esa hora
                if (c.getConsultorio() == consul) { 
                    return false;  // ----> el consultario esta ocupado
                }
            }
        }
        return true; // no hay ningun tipo de conflicto
    }

    public Cita crearCita(String id, Paciente paciente, Empleado medico,
                          Consultorio consultorio, String fecha,
                          String hora, String modalidad) {
        // Si la validacion devuelve false
        if (!validarDisponibilidad(medico, consultorio, fecha, hora)) {
            System.out.println("Medico o consultorio no disponible.");
            return null; // ---> no se crea la cita
        }
        // Verifica si el arreglo de citas está lleno
        if (cantidad >= citas.length) {
            System.out.println("No se pueden crear mas citas.");
            return null; // ---> no se crea la cita
        }
        //Crea una nueva cita con estado: Programada
        Cita cita = new Cita(id, paciente, medico, consultorio,
                             fecha, hora, modalidad, "Programada");
        citas[cantidad] = cita;
        cantidad++;
        return cita;
    }

    public void cambiarEstadoCita(String id, String nuevoEstado) {
        Cita c = buscarPorId(id);
        if (c != null) {
            c.setEstado(nuevoEstado);
        }
    }

    public Cita buscarPorId(String id) {
        for (int i = 0; i < cantidad; i++) {
            if (citas[i].getId().equals(id)) {
                return citas[i];
            }
        }
        return null;
    }

    public void listarCitas() {
        for (int i = 0; i < cantidad; i++) {
            System.out.println(citas[i].verResumen());
        }
    }

}
