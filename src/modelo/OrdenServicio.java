package modelo;

public class OrdenServicio {

    private String tipo;     // Laboratorio, Imagen, Procedimiento
    private String descripcion;
    private String estado;   // Pendiente, En proceso, Con resultado, Entregado
    private String resultadoTexto;

    public OrdenServicio(String tipo, String descripcion, String estado) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public String verInfo() {
        return tipo + ": " + descripcion + " - " + estado;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getResultadoTexto() {
        return resultadoTexto;
    }

    public void setResultadoTexto(String resultadoTexto) {
        this.resultadoTexto = resultadoTexto;
    }

}
