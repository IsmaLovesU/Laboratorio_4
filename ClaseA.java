/**
 * Universidad del Valle de Guatemala
 * Programación Orinetada a Objetos 
 * Sección: 10
 * Ing. Kimberly Barrera
 * Autores: Andrés Ismalej 24005, Juan Gualim 24852 y Jorge Villeda 24932
 * ClaseA (propia) - Laboratorio 4
 * 15/11/2024
*/
import java.util.Date;

/**
 * Interface que define las funcionalidades exclusivas de la Clase A.
 */
public interface ClaseA {
    /**
     * Cambia el modo de sonido entre speaker y auriculares.
     * @param sonido True para activar speaker, False para auriculares.
     * @return Mensaje indicando el cambio realizado.
     */
    public String cambiar(Boolean sonido);

    /**
     * Planifica un viaje con las fechas y lugares proporcionados.
     * @param inicio Fecha de inicio del viaje.
     * @param fin Fecha de finalización del viaje.
     * @param lugar_inicio Lugar de inicio del viaje.
     * @param lugar_final Lugar de destino.
     * @return Mensaje con los detalles del viaje planificado.
     */
    public String planificarViajes(Date inicio, Date fin, String lugar_inicio, String lugar_final);
}