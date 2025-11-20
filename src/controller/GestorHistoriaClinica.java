package controller;

import modelo.HistoriaClinica;
import modelo.Paciente;
import modelo.ConsultaMedica;

public class GestorHistoriaClinica {

    private HistoriaClinica[] historias;
    private int cantidad;

    public GestorHistoriaClinica(int max) {
        historias = new HistoriaClinica[max];
        cantidad = 0;
    }

    public HistoriaClinica obtenerOCrearHistoria(Paciente p) {
        
        // ----------------------OBTENER---------------------------
        
        //Busca en el arreglo de historias clinicas
        for (int i = 0; i < cantidad; i++) {
            //Del paciente usa su documento y lo compara con la historia(i)
            if (historias[i].getPaciente().getDocumento()
                    .equals(p.getDocumento())) {
                return historias[i]; //Retorna si lo encuentra
            }
        }
        // ----------------------CREAR---------------------------
        
        //Verifica si hay espacio
        if (cantidad < historias.length) {
            HistoriaClinica h = new HistoriaClinica(p, 50); //Guarda max 50 consultas de ese paciente
            historias[cantidad] = h;
            cantidad++;
            return h;
        }
        return null;
    }

    public void registrarConsulta(Paciente p, ConsultaMedica consulta) {
        HistoriaClinica h = obtenerOCrearHistoria(p);
        if (h != null) {
            h.agregarConsulta(consulta);
        }
    }

}
