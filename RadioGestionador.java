/**
 * Universidad del Valle de Guatemala
 * Programación Orinetada a Objetos 
 * Sección: 10
 * Ing. Kimberly Barrera
 * Autores: Andrés Ismalej 24005, Juan Gualim 24852 y Jorge Villeda 24932
 * Clase RadioGestionador - Laboratorio 4
 * 15/11/2024
*/

import java.util.ArrayList;
/**
 * Gestionador para las funcionalidades del modo radio.
 * Implementa la interfaz {@link ModoRadio} y proporciona las operaciones básicas
 * para manejar la modulación, emisoras actuales y emisoras guardadas.
 */
public class RadioGestionador implements ModoRadio {
    private String modulacion = "FM"; // La modulación actual de la radio (AM o FM).
    private double emisoraActual = 88.0; // La frecuencia de la emisora actualmente sintonizada.
    private ArrayList<Double> emisorasGuardadas = new ArrayList<>(); // Lista de emisoras guardadas.

    /**
     * Cambia la modulación de la radio entre AM y FM.
     * @return Un mensaje indicando la nueva modulación de la radio.
     */
    @Override
    public String cambiarModulacion() {
        modulacion = modulacion.equals("FM") ? "AM" : "FM";
        return "Modulación cambiada a: " + modulacion;
    }

    /**
     * Cambia la emisora actual de la radio a una nueva frecuencia.
     * @param nuevaEmisora La nueva frecuencia de la emisora a sintonizar.
     * @return Un mensaje indicando la nueva frecuencia de la emisora sintonizada.
     */
    @Override
    public String cambiarEmisora(double nuevaEmisora) {
        emisoraActual = nuevaEmisora + 0.5;
        return "Emisora cambiada a: " + nuevaEmisora;
    }

    /**
     * Guarda una emisora en la lista de emisoras favoritas.
     * @param emisora La frecuencia de la emisora a guardar.
     * @return Un mensaje confirmando que la emisora ha sido guardada, 
     *         o indicando que no se pueden guardar más emisoras si se alcanzó el límite.
     */
    @Override
    public String guardarEmisora(double emisora) {
        if (emisorasGuardadas.size() < 50) {
            emisorasGuardadas.add(emisora);
            return "Emisora " + emisora + " guardada.";
        }
        return "No se pueden guardar más emisoras.";
    }

    /**
     * Carga una emisora desde una posición específica de la lista de emisoras guardadas.
     * @param posicion La posición de la emisora en la lista de emisoras guardadas.
     * @return Un mensaje indicando la emisora cargada, o un error si la posición no es válida.
     */
    @Override
    public String cargarEmisora(int posicion) {
        if (posicion < emisorasGuardadas.size()) {
            emisoraActual = emisorasGuardadas.get(posicion);
            return "Emisora cargada: " + emisoraActual;
        }
        return "No existe emisora en esa posición.";
    }

    public double devolverEmisora(){
        return emisoraActual;
    }
}
