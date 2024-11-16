/**
 * Universidad del Valle de Guatemala
 * Programación Orinetada a Objetos 
 * Sección: 10
 * Ing. Kimberly Barrera
 * Autores: Andrés Ismalej 24005, Juan Gualim 24852 y Jorge Villeda 24932
 * Clase ModoTelefono - Laboratorio 4
 * 15/11/2024
*/

/**
 * Interface que define los métodos para el modo teléfono.
 */
public interface ModoTelefono {
    public String conectarTelefono();
    public String desconectarTelefono();
    public String llamarContacto(String contacto);
    public String finalizarLlamada();
}
