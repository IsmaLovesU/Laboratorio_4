/**
 * Universidad del Valle de Guatemala
 * Programación Orinetada a Objetos 
 * Sección: 10
 * Ing. Kimberly Barrera
 * Autores: Andrés Ismalej 24005, Juan Gualim 24852 y Jorge Villeda 24932
 * Clase de modo de reproducción - Laboratorio 4
 * 15/11/2024
*/

/**
 * Interface que define los métodos para el modo reproducción.
 */
public interface ModoReproduccion {
    public String seleccionarListaReproduccion(String lista);
    public String cambiarCancion(String direccion);
    public String escucharCancion();
}
