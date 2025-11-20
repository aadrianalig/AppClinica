package controller;

import modelo.Factura;
import modelo.Paciente;

public class GestorFacturacion {

    private Factura[] facturas;
    private int cantidad;

    public GestorFacturacion(int max) {
        facturas = new Factura[max];
        cantidad = 0;
    }

    public Factura generarFactura(String id, Paciente p, double montoConsulta, 
                double montoServicios, String metodoPago) {
        //Verifica si esta lleno el arreglo
        if (cantidad >= facturas.length) {
            return null;
        }
        //Sino crea nueva factura
        Factura f = new Factura(id, p, montoConsulta,
                montoServicios, metodoPago);
        facturas[cantidad] = f;
        cantidad++;
        return f;
    }

    public double calcularIngresosTotales() {
        double suma = 0;
        for (int i = 0; i < cantidad; i++) {
            suma += facturas[i].getTotal();
        }
        return suma;
    }

}
