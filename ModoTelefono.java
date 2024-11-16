/**
 * Interface que define los métodos para manejar las funcionalidades del modo teléfono.
 */
public interface ModoTelefono {

    /**
     * Conecta un teléfono al sistema del radio.
     * 
     * @return Un mensaje indicando que el teléfono ha sido conectado.
     */
    public String conectarTelefono();

    /**
     * Desconecta un teléfono del sistema del radio.
     * 
     * @return Un mensaje indicando que el teléfono ha sido desconectado.
     */
    public String desconectarTelefono();

    /**
     * Realiza una llamada al contacto especificado.
     * 
     * @param contacto El nombre del contacto al que se desea llamar.
     * @return Un mensaje indicando que la llamada se ha iniciado o un error si no es posible realizarla.
     */
    public String llamarContacto(String contacto);

    /**
     * Finaliza una llamada activa.
     * 
     * @return Un mensaje indicando que la llamada ha sido finalizada.
     */
    public String finalizarLlamada();
}
