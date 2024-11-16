/**
 * Clase que representa un contacto con un nombre y un número de teléfono.
 */
public class Contacto {
    private String nombre; // El nombre del contacto.
    private int numero; // El número de teléfono del contacto.

    /**
     * Constructor que inicializa un contacto con su nombre y número de teléfono.
     * 
     * @param nombre El nombre del contacto.
     * @param numero El número de teléfono del contacto.
     */
    public Contacto(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    /**
     * Obtiene el nombre del contacto.
     * 
     * @return El nombre del contacto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el número de teléfono del contacto.
     * 
     * @return El número de teléfono del contacto.
     */
    public int getNumero() {
        return numero;
    }
}
