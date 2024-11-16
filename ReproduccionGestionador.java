/**
 * Universidad del Valle de Guatemala
 * Programación Orinetada a Objetos 
 * Sección: 10
 * Ing. Kimberly Barrera
 * Autores: Andrés Ismalej 24005, Juan Gualim 24852 y Jorge Villeda 24932
 * Clase ReproduccionGestionador - Laboratorio 4
 * 28/10/2024
*/

import java.util.ArrayList;

/**
 * Gestionador para las funcionalidades del modo reproducción.
 * Implementa la interfaz {@code ModoReproduccion}.
 */
public class ReproduccionGestionador implements ModoReproduccion {
    private ArrayList<String> listasReproduccion = new ArrayList<>();
    private ArrayList<String> canciones = new ArrayList<>();
    private int cancionActual = 0;

    /**
     * Constructor que inicializa las listas de reproducción y las canciones disponibles.
     */
    public ReproduccionGestionador() {
        // Listas de reproducción predefinidas
        listasReproduccion.add("Pop");
        listasReproduccion.add("Rock");
        listasReproduccion.add("Jazz");
        listasReproduccion.add("Regueton");

        // Canciones iniciales para cualquier lista
        canciones.add("A Bar Song (Tipsy), 3:45, Shaboozey, Hip-Hop/Rap");
        canciones.add("Die with a Smile, 4:12, Lady Gaga y Bruno Mars, Pop");
        canciones.add("Birds of a Feather (Hit Me Hard and Soft), 3:58, Billie Eilish, Pop Alternativo");
        canciones.add("Espresso, 3:30, Sabrina Carpenter, Pop");
    }

    /**
     * Selecciona una lista de reproducción específica.
     * @param lista El nombre de la lista de reproducción a seleccionar.
     * @return Un mensaje indicando si la lista de reproducción fue seleccionada correctamente o si no existe.
     */
    @Override
    public String seleccionarListaReproduccion(String lista) {
        if (listasReproduccion.contains(lista)) {
            return "Lista de reproducción seleccionada: " + lista;
        }
        return "La lista de reproducción '" + lista + "' no existe.";
    }

    /**
     * Cambia la canción dentro de la lista de reproducción actual.
     * @param direccion La dirección del cambio: "adelante" para la siguiente canción,
     *                  "atras" para la canción anterior.
     * @return Un mensaje indicando la canción que se está reproduciendo después del cambio.
     */
    @Override
    public String cambiarCancion(String direccion) {
        if (direccion.equalsIgnoreCase("adelante")) {
            cancionActual = (cancionActual + 1) % canciones.size();
        } else if (direccion.equalsIgnoreCase("atras")) {
            cancionActual = (cancionActual - 1 + canciones.size()) % canciones.size();
        } else {
            return "Dirección inválida. Use 'adelante' o 'atras'.";
        }
        return "Reproduciendo: " + canciones.get(cancionActual);
    }

    /**
     * Devuelve la información de la canción que se está reproduciendo actualmente.
     * @return Un mensaje con los detalles de la canción en reproducción.
     */
    @Override
    public String escucharCancion() {
        return "Escuchando: " + canciones.get(cancionActual);
    }
}
