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

    // Devuelve el arreglo de facturas y la cantidad real
    public Factura[] getFacturas() {
        return facturas;
    }

    public int getCantidad() {
        return cantidad;
    }

// Buscar por id
    public Factura buscarPorId(String id) {
        for (int i = 0; i < cantidad; i++) {
            if (facturas[i].getId().equals(id)) {
                return facturas[i];
            }
        }
        return null;
    }

// Registrar (o delega a tu agregarFactura si ya existe)
    public boolean registrarFactura(Factura f) {
        if (cantidad >= facturas.length) {
            return false;
        }
        if (buscarPorId(f.getId()) != null) {
            return false; // no duplicar
        }
        facturas[cantidad] = f;
        cantidad++;
        return true;
    }

}
