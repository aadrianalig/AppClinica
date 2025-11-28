package controller;

public class GestorDeGestores {

    // ---- Gestores principales del sistema ----
    private GestorEmpleados gestorEmpleados;
    private GestorPacientes gestorPacientes;
    private GestorConsultorios gestorConsultorios;
    private GestorCitas gestorCitas;
    private GestorFacturacion gestorFacturacion;
    private GestorReportes gestorReportes;

    // ---- Constructor: inicializa todos los gestores ----
    public GestorDeGestores() {
        // Capacidades de gestores
        gestorEmpleados    = new GestorEmpleados(50);
        gestorPacientes    = new GestorPacientes(200);
        gestorConsultorios = new GestorConsultorios(50);
        gestorCitas        = new GestorCitas(300);
        gestorFacturacion  = new GestorFacturacion(300);
        //para que tenga acceso a los demas gestores
        gestorReportes     = new GestorReportes(this);
    }

    // ----- Getters para que las ventanas usen los gestores ------
    public GestorEmpleados getGestorEmpleados() {
        return gestorEmpleados;
    }

    public GestorPacientes getGestorPacientes() {
        return gestorPacientes;
    }

    public GestorConsultorios getGestorConsultorios() {
        return gestorConsultorios;
    }

    public GestorCitas getGestorCitas() {
        return gestorCitas;
    }

    public GestorFacturacion getGestorFacturacion() { 
        return gestorFacturacion; 
    }
    public GestorReportes getGestorReportes() { 
        return gestorReportes; 
    }
}
