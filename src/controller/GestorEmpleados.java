package controller;

import modelo.Empleado;

public class GestorEmpleados {

    private Empleado[] empleados;
    private int cantidad;

    public GestorEmpleados(int max) {
        empleados = new Empleado[max];
        cantidad = 0;
        cargarEmpleadosDemo();
    }

    public void agregarEmpleado(Empleado e) {
        if (cantidad < empleados.length) {
            empleados[cantidad] = e;
            cantidad++;
        }
    }

    public Empleado buscarPorDni(String dni) {
        for (int i = 0; i < cantidad; i++) {
            if (empleados[i].getDni().equals(dni)) {
                return empleados[i];
            }
        }
        return null;
    }

    public boolean registrarEmpleado(Empleado e) {
        // validar capacidad
        if (cantidad >= empleados.length) {
            return false;
        }
        // evitar duplicados por DNI
        if (buscarPorDni(e.getDni()) != null) {
            return false;
        }
        // insertar al final
        empleados[cantidad] = e;
        cantidad++;
        return true;
    }

    // Devuelve la referencia al arreglo interno (solo lectura desde fuera)
    public Empleado[] getEmpleados() {
        return empleados;    
    }

    // Devuelve cuántos empleados reales hay cargados
    public int getCantidad() {
        return cantidad;     
    }

    private void cargarEmpleadosDemo() {
        //Empleado (Sdni, Snombres, Sapellidos, 
        //           Srol, Sespecialidad, Stelefono, Semail
        //             Susuario, Spassword)

        // admins
        agregarEmpleado(new Empleado("12345678", "Pepe", "Sanchez",
                "ADMIN", "", "999111222", "ana@gmail.com",
                "admin", "admin123"));

        // recepcionista
        agregarEmpleado(new Empleado("23456789", "Rosa", "Rios",
                "RECEP", "", "999222333", "rosa@gmail.com",
                "recep", "recep123"));

        // medico
        agregarEmpleado(new Empleado("34567890", "Carlos", "Cassasa",
                "MEDICO", "Medicina General", "999333444",
                "carlos@gmail.com", "medico", "medico123"));

        // enfermeria
        agregarEmpleado(new Empleado("45678901", "Luis", "Rojas",
                "ENF", "", "999444555", "luis@gmail.com",
                "enf", "enf123"));

        // cajero
        agregarEmpleado(new Empleado("56789012", "Marta", "Diaz",
                "CAJERO", "", "999555666", "marta@gmail.com",
                "cajero", "cajero123"));
    }

    public Empleado login(String usuario, String password) {
        for (int i = 0; i < cantidad; i++) {
            if (empleados[i].getUsuario().equals(usuario) // comprueba que existe un usurio con esa contrasenia
                    && empleados[i].getPassword().equals(password)) {
                return empleados[i]; //si existe retorna el empleado
            }
        }
        return null;
    }

    public void listarEmpleados() {
        for (int i = 0; i < cantidad; i++) {
            System.out.println(empleados[i].verResumen());
        }
    }

}
