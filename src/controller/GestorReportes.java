package controller;

import modelo.Empleado;
import modelo.Paciente;

public class GestorReportes {

    private GestorDeGestores gg;

    public GestorReportes(GestorDeGestores gg) {
        this.gg = gg;
    }

    // --- Pacientes ---- 
    //para Jtable
    public String[] columnasPacientes() {
        return new String[]{"Documento", "TipoDoc", "Nombres", "Apellidos", "Telefono", "Email"};
    }

    //matriz datos
    public Object[][] datosPacientes() {
        GestorPacientes gp = gg.getGestorPacientes();   // pido el gestor de pacientes de gg
        Paciente[] arr = gp.getPacientes(); // arreglo con los pacientes
        int n = gp.getCantidad();           // cantidad pacientes 

        Object[][] data = new Object[n][6]; //n filas x 6 (doc, tipoDoc, nombres, apellidos, telef, email)

        for (int i = 0; i < n; i++) {
            Paciente p = arr[i];
            data[i][0] = p.getDocumento();
            data[i][1] = p.getTipoDocumento();
            data[i][2] = p.getNombres();
            data[i][3] = p.getApellidos();
            data[i][4] = p.getTelefono();
            data[i][5] = p.getEmail();
        }
        return data;
    }

    // --- Empleados ---
    //para Jtable
    public String[] columnasEmpleados() {
        return new String[]{"DNI", "Nombres", "Apellidos", "Rol", "Especialidad"};
    }

    //matriz datos
    public Object[][] datosEmpleados() {
        GestorEmpleados ge = gg.getGestorEmpleados();  // pido el gestor de empleados de gg
        Empleado[] arr = ge.getEmpleados();   // arreglo con los empleados
        int n = ge.getCantidad();             // cantidad empleados

        Object[][] data = new Object[n][5];  //n filas x 5 para la tabla
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

    public String[] rolesBase() {
        return new String[]{"ADMIN", "RECEP", "MEDICO", "ENF", "CAJERO"};
    }

    public int[] conteoEmpleadosPorRol() {

        GestorEmpleados ge = gg.getGestorEmpleados();   // pido el gestor de empleados de gg
        Empleado[] arr = ge.getEmpleados();              // arreglo con los empleados
        int n = ge.getCantidad();                        // cantidad empleados

        int[] c = new int[5]; // ADMIN, RECEP, MEDICO, ENF, CAJERO   
        for (int i = 0; i < n; i++) {                                        
            String r = arr[i].getRol();   // rol del empleado actual
            if ("ADMIN".equals(r)) {   // si es ADMIN
                c[0]++; //ADMIN++
            } else if ("RECEP".equals(r)) { // si es RECEP
                c[1]++; //RECEP++
            } else if ("MEDICO".equals(r)) { // si es MEDICO
                c[2]++; //MEDICO++
            } else if ("ENF".equals(r)) { // si es ENF
                c[3]++; //ENF++
            } else if ("CAJERO".equals(r)) { // si es CAJERO
                c[4]++; //CAJERO++
            }
        }
        return c;    // devuelvo el vector con los conteos
    }
}
