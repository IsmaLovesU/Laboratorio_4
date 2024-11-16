/**
 * Universidad del Valle de Guatemala
 * Programación Orinetada a Objetos 
 * Sección: 10
 * Ing. Kimberly Barrera
 * Andrés Ismalej 24005
 * Clase ClaseAGestionador - Ejercicio 6
 * 28/10/2024
*/

import java.util.Date;

/**
 * Gestionador para las funcionalidades exclusivas de la Clase A.
 * Implementa la interfaz ClaseA.
 */
public class ClaseAGestionador implements ClaseA {

    /**
     * Cambia el modo de sonido entre speaker y auriculares.
     * @param sonido True para activar el modo speaker, False para auriculares.
     *               Si el valor es null, se devolverá un mensaje indicando que no se especificó el modo.
     * @return Un mensaje indicando el cambio realizado o si el modo no fue especificado.
     */
    @Override
    public String cambiar(Boolean sonido) {
        if (sonido == null) {
            return "Modo de sonido no especificado.";
        }
        return sonido ? "Modo speaker activado." : "Modo auriculares activado.";
    }

    /**
     * Planifica un viaje con las fechas y lugares proporcionados.
     * @param inicio       Fecha de inicio del viaje.
     * @param fin          Fecha de finalización del viaje.
     * @param lugar_inicio Lugar de inicio del viaje.
     * @param lugar_final  Lugar de destino.
     * @return Un mensaje con los detalles del viaje planificado. Si algún dato está incompleto,
     *         se devolverá un mensaje de error.
     */
    @Override
    public String planificarViajes(Date inicio, Date fin, String lugar_inicio, String lugar_final) {
        if (inicio == null || fin == null || lugar_inicio == null || lugar_final == null) {
            return "Error: Datos incompletos para planificar el viaje.";
        }
        return "Viaje planificado desde " + lugar_inicio + " hasta " + lugar_final +
               " del " + inicio + " al " + fin + ".";
    }
}
