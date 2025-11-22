package modelo;

public class Factura {

    private String id;
    private Paciente paciente;
    private double montoConsulta;
    private double montoServicios;
    private double total;
    private String metodoPago; // efectivo, tarjeta

    public Factura(String id, Paciente paciente,
                   double montoConsulta, double montoServicios,
                   String metodoPago) {
        this.id = id;
        this.paciente = paciente;
        this.montoConsulta = montoConsulta;
        this.montoServicios = montoServicios;
        this.total = montoConsulta + montoServicios;
        this.metodoPago = metodoPago;
    }

    public String verDetalle() {
        return "Factura " + id +
               " Paciente: " + paciente.getNombres() +
               " Total: " + total +
               " Pago: " + metodoPago;
    }

    public double getTotal() {
        return total;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public double getMontoConsulta() {
        return montoConsulta;
    }

    public void setMontoConsulta(double montoConsulta) {
        this.montoConsulta = montoConsulta;
    }

    public double getMontoServicios() {
        return montoServicios;
    }

    public void setMontoServicios(double montoServicios) {
        this.montoServicios = montoServicios;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
    
    

}
