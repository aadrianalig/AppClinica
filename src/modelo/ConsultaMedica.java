package modelo;

public class ConsultaMedica {

    private Cita cita;
    private String motivo;
    private String antecedentes;
    private String signosVitales;
    private String examenFisico;
    private String diagnosticos; // texto simple
    private String plan;

    public ConsultaMedica(Cita cita) {
        this.cita = cita;
    }

    public String verResumenClinico() {
        return "Resumen consulta de " +
               cita.getPaciente().getNombres() +
               " Motivo: " + motivo +
               " Diagnosticos: " + diagnosticos;
    }

    public Cita getCita() {
        return cita;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(String antecedentes) {
        this.antecedentes = antecedentes;
    }

    public String getSignosVitales() {
        return signosVitales;
    }

    public void setSignosVitales(String signosVitales) {
        this.signosVitales = signosVitales;
    }

    public String getExamenFisico() {
        return examenFisico;
    }

    public void setExamenFisico(String examenFisico) {
        this.examenFisico = examenFisico;
    }

    public String getDiagnosticos() {
        return diagnosticos;
    }

    public void setDiagnosticos(String diagnosticos) {
        this.diagnosticos = diagnosticos;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

}
