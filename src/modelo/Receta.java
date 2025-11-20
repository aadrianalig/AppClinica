package modelo;

public class Receta {

    private String medicamento;
    private String dosis;
    private String frecuencia;
    private int duracionDias;

    public Receta(String medicamento, String dosis,
                  String frecuencia, int duracionDias) {
        this.medicamento = medicamento;
        this.dosis = dosis;
        this.frecuencia = frecuencia;
        this.duracionDias = duracionDias;
    }

    public String verDetalle() {
        return medicamento + " - " + dosis +
               " cada " + frecuencia +
               " por " + duracionDias + " dias";
    }

    public String getMedicamento() {
        return medicamento;
    }

    public String getDosis() {
        return dosis;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public int getDuracionDias() {
        return duracionDias;
    }

}
