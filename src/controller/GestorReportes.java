package controller;

import modelo.Empleado;
import modelo.Paciente;

public class GestorReportes {

    private GestorDeGestores gg;

    public GestorReportes(GestorDeGestores gg) {
        this.gg = gg;
    }

    // ====== Pacientes (para JTable) ======
    public String[] columnasPacientes() {
        return new String[]{"Documento","TipoDoc","Nombres","Apellidos","Telefono","Email"};
    }

    public Object[][] datosPacientes() {
        var gp = gg.getGestorPacientes();
        Paciente[] arr = gp.getPacientes();
        int n = gp.getCantidad();
        Object[][] data = new Object[n][6];
        for (int i = 0; i < n; i++) {
            Paciente p = arr[i];
            data[i][0] = p.getDocumento();
            data[i][1] = p.getTipoDocumento(); // ajusta si tu getter se llama distinto
            data[i][2] = p.getNombres();
            data[i][3] = p.getApellidos();
            data[i][4] = p.getTelefono();
            data[i][5] = p.getEmail();
        }
        return data;
    }

    // ====== Empleados (listado + conteo por rol) ======
    public String[] columnasEmpleados() {
        return new String[]{"DNI","Nombres","Apellidos","Rol","Especialidad"};
    }

    public Object[][] datosEmpleados() {
        var ge = gg.getGestorEmpleados();
        Empleado[] arr = ge.getEmpleados();
        int n = ge.getCantidad();
        Object[][] data = new Object[n][5];
        for (int i = 0; i < n; i++) {
            Empleado e = arr[i];
            data[i][0] = e.getDni();
            data[i][1] = e.getNombres();
            data[i][2] = e.getApellidos();
            data[i][3] = e.getRol();
            data[i][4] = e.getEspecialidad();
        }
        return data;
    }

    // conteo simple por rol (ADMIN, RECEP, MEDICO, ENF, CAJERO)
    public String[] rolesBase() {
        return new String[]{"ADMIN","RECEP","MEDICO","ENF","CAJERO"};
    }

    public int[] conteoEmpleadosPorRol() {
        var ge = gg.getGestorEmpleados();
        Empleado[] arr = ge.getEmpleados();
        int n = ge.getCantidad();
        int[] c = new int[5]; // ADMIN, RECEP, MEDICO, ENF, CAJERO
        for (int i = 0; i < n; i++) {
            String r = arr[i].getRol();
            if ("ADMIN".equals(r)) c[0]++;
            else if ("RECEP".equals(r)) c[1]++;
            else if ("MEDICO".equals(r)) c[2]++;
            else if ("ENF".equals(r)) c[3]++;
            else if ("CAJERO".equals(r)) c[4]++;
        }
        return c;
    }
}
