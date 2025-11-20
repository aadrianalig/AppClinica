package modelo;

public class Cita {

    private String id;
    private Paciente paciente;
    private Empleado medico;
    private Consultorio consultorio;
    private String fecha;
    private String hora;
    private String modalidad; // Presencial / Virtual
    private String estado;    // Programada, Confirmada, En sala, Atendida, Cancelada, No show

    public Cita(String id, Paciente paciente, Empleado medico, Consultorio consultorio, String fecha, String hora, String modalidad, String estado) {
        this.id = id;
        this.paciente = paciente;
        this.medico = medico;
        this.consultorio = consultorio;
        this.fecha = fecha;
        this.hora = hora;
        this.modalidad = modalidad;
        this.estado = estado;
    }

    public String verResumen() {
        return "Cita " + id + " - " + fecha + " " + hora
                + " Paciente: " + paciente.getNombres()
                + " Medico: " + medico.getNombres()
                + " Estado: " + estado;
    }

    public String getId() {
        return id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Empleado getMedico() {
        return medico;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public String getModalidad() {
        return modalidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
