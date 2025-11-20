package modelo;

public class HistoriaClinica {

    private Paciente paciente;
    private ConsultaMedica[] consultas;
    private int cantidadConsultas;

    public HistoriaClinica(Paciente paciente, int maxConsultas) {
        this.paciente = paciente;
        this.consultas = new ConsultaMedica[maxConsultas];
        this.cantidadConsultas = 0;
    }

    public void agregarConsulta(ConsultaMedica consulta) {
        if (cantidadConsultas < consultas.length) {
            consultas[cantidadConsultas] = consulta;
            cantidadConsultas++;
        }
    }

    public void mostrarConsultas() {
        System.out.println("Historia clinica de: " +
                paciente.getNombres() + " " + paciente.getApellidos());
        for (int i = 0; i < cantidadConsultas; i++) {
            System.out.println(consultas[i].verResumenClinico());
        }
    }

    public Paciente getPaciente() {
        return paciente;
    }

}
