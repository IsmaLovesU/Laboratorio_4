/**
 * Universidad del Valle de Guatemala
 * Programación Orinetada a Objetos 
 * Sección: 10
 * Ing. Kimberly Barrera
 * Autores: Andrés Ismalej 24005, Juan Gualim 24852 y Jorge Villeda 24932
 * Clase ModoRadio - Laboratorio 4
 * 15/11/2024
*/

/**
 * Interface que define los métodos para manejar las funcionalidades del modo radio.
 */
public interface ModoRadio {
    /**
     * Cambia la modulación de la radio entre AM y FM.
     * @return Un mensaje indicando la modulación actual después del cambio.
     */
    public String cambiarModulacion();

    /**
     * Cambia la emisora actual de la radio a la frecuencia especificada.
     * @param nuevaEmisora La nueva frecuencia de la emisora a sintonizar.
     * @return Un mensaje indicando la nueva frecuencia de la emisora sintonizada.
     */
    public String cambiarEmisora(double nuevaEmisora);

    /**
     * Guarda la emisora especificada en una lista de emisoras favoritas.
     * @param emisora La frecuencia de la emisora a guardar.
     * @return Un mensaje confirmando que la emisora ha sido guardada.
     */
    public String guardarEmisora(double emisora);

    /**
     * Carga una emisora guardada desde una posición específica en la lista de emisoras favoritas.
     * @param posicion La posición en la lista de emisoras favoritas desde donde se cargará la emisora.
     * @return Un mensaje indicando la frecuencia de la emisora cargada.
     */
    public String cargarEmisora(int posicion);
}
