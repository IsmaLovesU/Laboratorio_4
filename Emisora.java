public class Emisora {
    private String modulacion;
    private double estacion;

    public Emisora(String modulacion, double estacion) {
        this.modulacion = modulacion;
        this.estacion = estacion;
    }

    public String getModulacion() { return modulacion; }
    public void setModulacion(String modulacion) { this.modulacion = modulacion; }

    public double getEstacion() { return estacion; }
    public void setEstacion(double estacion) { this.estacion = estacion; }
}