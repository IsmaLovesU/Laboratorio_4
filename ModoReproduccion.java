/**
 * Universidad del Valle de Guatemala
 * Programación Orinetada a Objetos 
 * Sección: 10
 * Ing. Kimberly Barrera
 * Autores: Andrés Ismalej 24005, Juan Gualim 24852 y Jorge Villeda 24932
 * Clase ModoReproduccion - Laboratorio 4
 * 15/11/2024
*/

/**
 * Interfaz que define las funcionalidades principales del modo de reproducción.
 */
public interface ModoReproduccion {

    /**
     * Selecciona una lista de reproducción específica.
     * @param lista El nombre de la lista de reproducción a seleccionar.
     * @return Un mensaje indicando si la lista de reproducción fue seleccionada correctamente o no.
     */
    public String seleccionarListaReproduccion(String lista);

    /**
     * Cambia la canción dentro de la lista de reproducción actual.
     * @param direccion La dirección del cambio: "adelante" para la siguiente canción, 
     *                  "atras" para la canción anterior.
     * @return Un mensaje indicando la canción que se está reproduciendo después del cambio.
     */
    public String cambiarCancion(String direccion);

    /**
     * Devuelve la información de la canción que se está reproduciendo actualmente.
     * @return Un mensaje con los detalles de la canción en reproducción.
     */
    public String escucharCancion();
}

