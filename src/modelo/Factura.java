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

}
