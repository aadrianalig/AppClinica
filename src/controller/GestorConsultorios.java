package controller;

import modelo.Consultorio;

public class GestorConsultorios {

    private Consultorio[] consultorios;
    private int cantidad;

    public GestorConsultorios(int max) {
        consultorios = new Consultorio[max];
        cantidad = 0;
    }
    
    public void listarConsultorios() {
        for (int i = 0; i < cantidad; i++) {
            System.out.println(consultorios[i].verInfo());
        }
    }

    // getters para la tabla
    public Consultorio[] getConsultorios() {
        return consultorios;
    }

    public int getCantidad() {
        return cantidad;
    }

    // buscar por código
    public Consultorio buscarPorCodigo(String codigo) {
        for (int i = 0; i < cantidad; i++) {
            if (consultorios[i].getCodigo().equals(codigo)) {
                return consultorios[i];
            }
        }
        return null;
    }

    // registrar (o delega a agregarConsultorio(...) si ya lo tienes)
    public boolean registrarConsultorio(Consultorio c) {
        if (cantidad >= consultorios.length) {
            return false;
        }
        if (buscarPorCodigo(c.getCodigo()) != null) {
            return false; // no duplicar
        }
        consultorios[cantidad] = c;
        cantidad++;
        return true;
    }

}
