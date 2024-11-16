/**
 * Interface que define los métodos para el modo teléfono.
 */
public interface ModoTelefono {
    public String conectarTelefono();
    public String desconectarTelefono();
    public String llamarContacto(String contacto);
    public String finalizarLlamada();
}
