/**
 * Universidad del Valle de Guatemala
 * Programación Orinetada a Objetos 
 * Sección: 10
 * Ing. Kimberly Barrera
 * Autores: Andrés Ismalej 24005, Juan Gualim 24852 y Jorge Villeda 24932
 * Clase cancion - Laboratorio 4
 * 15/11/2024
*/

/**
 * Clase que representa una canción con sus atributos principales.
 */
public class Cancion {
    private String nombre;
    private double duracion;
    private String autor;
    private String genero;

    /**
     * Constructor para inicializar una instancia de Cancion.
     * @param nombre  El nombre de la canción.
     * @param duracion La duración de la canción en minutos.
     * @param autor   El autor o creador de la canción.
     * @param genero  El género musical de la canción.
     */
    public Cancion(String nombre, double duracion, String autor, String genero) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.autor = autor;
        this.genero = genero;
    }

    /**
     * Obtiene el nombre de la canción.
     * @return El nombre de la canción.
     */
    public String getNombre() { return nombre; }

    /**
     * Obtiene la duración de la canción en minutos.
     * @return La duración de la canción.
     */
    public double getDuracion() { return duracion; }

    /**
     * Obtiene el autor o creador de la canción.
     * @return El autor de la canción.
     */
    public String getAutor() { return autor; }

    /**
     * Obtiene el género musical de la canción.
     * @return El género de la canción.
     */
    public String getGenero() { return genero; }
}
