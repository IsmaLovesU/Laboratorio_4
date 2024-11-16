/**
 * Universidad del Valle de Guatemala
 * Programación Orinetada a Objetos 
 * Sección: 10
 * Ing. Kimberly Barrera
 * Autores: Andrés Ismalej 24005, Juan Gualim 24852 y Jorge Villeda 24932
 * Clase Contacto - Laboratorio 4
 * 15/11/2024
*/

/**
 * Clase que representa un contacto con un nombre y un número de teléfono.
 */
public class Contacto {
    private String nombre; 
    private int numero; 

    /**
     * Constructor que inicializa un contacto con su nombre y número de teléfono.
     * @param nombre El nombre del contacto.
     * @param numero El número de teléfono del contacto.
     */
    public Contacto(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    /**
     * Obtiene el nombre del contacto.
     * @return El nombre del contacto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el número de teléfono del contacto.
     * @return El número de teléfono del contacto.
     */
    public int getNumero() {
        return numero;
    }
}
