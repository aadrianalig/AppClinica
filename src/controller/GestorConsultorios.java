package controller;

import modelo.Consultorio;

public class GestorConsultorios {

    private Consultorio[] consultorios;
    private int cantidad;

    public GestorConsultorios(int max) {
        consultorios = new Consultorio[max];
        cantidad = 0;
    }

    public void registrarConsultorio(Consultorio c) {
        if (cantidad < consultorios.length) {
            consultorios[cantidad] = c; //  (Scodigo, Sespecialidad, Sestado)
            cantidad++;
        }
    }

    public Consultorio buscarPorCodigo(String codigo) {
        for (int i = 0; i < cantidad; i++) {
            if (consultorios[i].getCodigo().equals(codigo)) {
                return consultorios[i];
            }
        }
        return null;
    }

    public void listarConsultorios() {
        for (int i = 0; i < cantidad; i++) {
            System.out.println(consultorios[i].verInfo());
        }
    }

}
