/**
 * Clase que representa una emisora de radio con modulación y estación.
 */
public class Emisora {
    private String modulacion; // Tipo de modulación de la emisora (AM o FM).
    private double estacion;   // Frecuencia de la emisora.

    /**
     * Constructor que inicializa una emisora con su modulación y estación.
     * 
     * @param modulacion El tipo de modulación de la emisora (AM o FM).
     * @param estacion La frecuencia de la emisora.
     */
    public Emisora(String modulacion, double estacion) {
        this.modulacion = modulacion;
        this.estacion = estacion;
    }

    /**
     * Obtiene el tipo de modulación de la emisora.
     * 
     * @return El tipo de modulación (AM o FM).
     */
    public String getModulacion() {
        return modulacion;
    }

    /**
     * Establece el tipo de modulación de la emisora.
     * 
     * @param modulacion El nuevo tipo de modulación (AM o FM).
     */
    public void setModulacion(String modulacion) {
        this.modulacion = modulacion;
    }

    /**
     * Obtiene la frecuencia de la emisora.
     * 
     * @return La frecuencia de la emisora.
     */
    public double getEstacion() {
        return estacion;
    }

    /**
     * Establece la frecuencia de la emisora.
     * 
     * @param estacion La nueva frecuencia de la emisora.
     */
    public void setEstacion(double estacion) {
        this.estacion = estacion;
    }
}
