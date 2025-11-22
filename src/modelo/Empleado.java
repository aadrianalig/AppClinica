package modelo;

public class Empleado {

    private String dni;
    private String nombres;
    private String apellidos;
    private String rol;        // "ADMIN", "RECEP", "MEDICO", "ENF", "CAJERO"
    private String especialidad; // solo medicos
    private String telefono;
    private String email;
    private String usuario;
    private String password;

    public Empleado(String dni, String nombres, String apellidos, String rol,
            String especialidad, String telefono, String email, String usuario, String password) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.rol = rol;
        this.especialidad = especialidad;
        this.telefono = telefono;
        this.email = email;
        this.usuario = usuario;
        this.password = password;
    }

    public String verResumen() {
        return "Empleado: " + this.nombres + " " + this.apellidos
                + "\nRol: " + this.rol + "\nDNI: " + this.dni;
    }


    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
