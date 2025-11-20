package modelo;

public class Consultorio {

    private String codigo;
    private String especialidad;
    private String estado; // Disponible, Ocupado, Mantenimiento

    public Consultorio(String codigo, String especialidad, String estado) {
        this.codigo = codigo;
        this.especialidad = especialidad;
        this.estado = estado;
    }

    public String verInfo() {
        return "Consultorio " + codigo +
               " (" + especialidad + ") - " + estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
