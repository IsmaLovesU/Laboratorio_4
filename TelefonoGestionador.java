/**
 * Universidad del Valle de Guatemala
 * Programación Orinetada a Objetos 
 * Sección: 10
 * Ing. Kimberly Barrera
 * Autores: Andrés Ismalej 24005, Juan Gualim 24852 y Jorge Villeda 24932
 * Clase TelefonoGestionador - Laboratorio 4
 * 28/10/2024
*/

import java.util.ArrayList;

/**
 * Clase que gestiona las funcionalidades relacionadas con el modo teléfono.
 * Implementa la interfaz {@code ModoTelefono}.
 */
public class TelefonoGestionador implements ModoTelefono {
    private boolean telefonoConectado = false;
    private ArrayList<Contacto> contactos = new ArrayList<>();

    /**
     * Constructor que inicializa la lista de contactos con valores predefinidos.
     */
    public TelefonoGestionador() {
        // Contactos iniciales
        contactos.add(new Contacto("Juan Perez", 12345678));
        contactos.add(new Contacto("Maria Lopez", 87654321));
    }

    /**
     * Conecta el teléfono al sistema.
     * @return Un mensaje indicando si el teléfono ya estaba conectado o si la conexión fue exitosa.
     */
    @Override
    public String conectarTelefono() {
        if (telefonoConectado) {
            return "El teléfono ya está conectado.";
        }
        telefonoConectado = true;
        return "Teléfono conectado.";
    }

    /**
     * Desconecta el teléfono del sistema.
     * @return Un mensaje indicando si el teléfono ya estaba desconectado o si la desconexión fue exitosa.
     */
    @Override
    public String desconectarTelefono() {
        if (!telefonoConectado) {
            return "El teléfono ya está desconectado.";
        }
        telefonoConectado = false;
        return "Teléfono desconectado.";
    }

    /**
     * Llama a un contacto por su nombre.
     * @param contacto El nombre del contacto al que se desea llamar.
     * @return Un mensaje indicando si la llamada se inició o si el teléfono no está conectado.
     */
    @Override
    public String llamarContacto(String contacto) {
        if (!telefonoConectado) {
            return "Conecta el teléfono antes de llamar.";
        }
        return "Llamando a: " + contacto;
    }

    /**
     * Finaliza la llamada activa.
     * @return Un mensaje indicando que la llamada fue finalizada.
     */
    @Override
    public String finalizarLlamada() {
        return "Llamada finalizada.";
    }

    /**
     * Muestra todos los contactos disponibles en el sistema.
     * @return Una lista de contactos en formato texto. Si no hay contactos disponibles,
     *         se devuelve un mensaje indicando que no hay contactos.
     */
    public String mostrarContactos() {
        if (contactos.isEmpty()) {
            return "No hay contactos disponibles.";
        }
        StringBuilder listaContactos = new StringBuilder("Contactos disponibles:\n");
        for (Contacto contacto : contactos) {
            listaContactos.append(contacto.getNombre()).append(" - ").append(contacto.getNumero()).append("\n");
        }
        return listaContactos.toString();
    }
}
