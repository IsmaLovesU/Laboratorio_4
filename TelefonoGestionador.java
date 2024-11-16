import java.util.ArrayList;

public class TelefonoGestionador implements ModoTelefono {
    private boolean telefonoConectado = false;
    private ArrayList<Contacto> contactos = new ArrayList<>();

    public TelefonoGestionador() {
        // Contactos iniciales
        contactos.add(new Contacto("Juan Perez", 12345678));
        contactos.add(new Contacto("Maria Lopez", 87654321));
    }

    @Override
    public String conectarTelefono() {
        if (telefonoConectado) {
            return "El teléfono ya está conectado.";
        }
        telefonoConectado = true;
        return "Teléfono conectado.";
    }

    @Override
    public String desconectarTelefono() {
        if (!telefonoConectado) {
            return "El teléfono ya está desconectado.";
        }
        telefonoConectado = false;
        return "Teléfono desconectado.";
    }

    @Override
    public String llamarContacto(String contacto) {
        if (!telefonoConectado) {
            return "Conecta el teléfono antes de llamar.";
        }
        return "Llamando a: " + contacto;
    }

    @Override
    public String finalizarLlamada() {
        return "Llamada finalizada.";
    }

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