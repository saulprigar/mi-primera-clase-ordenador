/**
 * Primera clase creada desde 0 en Programación de 1ºDAM
 * La clase simula un ordenador, teniendo dueño, bateria y si esta o no encendido.
 * 
 * @author Saúl Prieto García (@saulprigarci)
 * @version 1.0 (03/12/25)
 */
public class Ordenador {

    // Atributos de la clase Ordenador.
    private String nombreDueno; // Atributo de tipo cadena String.
    private int porcentajeBateria; // Atributo de tipo int.
    private boolean encendido; // Atributo de tipo boolean.

    /**
     * Método constructor de la clase.
     * 
     * @param elNombre Parámetro de tipo cadena String que nos permite asignarle el valor al atributo 'nombreDueno'.
     * @param laBateria Parámetro de tipo int que nos permite asignarle el valor al atributo 'porcentajeBateria'.
     */
    public Ordenador(String elNombre, int laBateria) {
        nombreDueno = elNombre;
        porcentajeBateria = laBateria;
        encendido = true;
    }

    /**
     * Método que nos devuelve el valor del atributo 'nombreDueno'.
     * @return nos devuelve el valor del atributo 'nombreDueno'.
     */
    public String getNombreDueno() {
        return nombreDueno;
    }

    /**
     * Método que nos devuelve el valor del atributo 'porcentajeBateria'.
     * @return nos devuelve el valor del atributo 'porcentajeBateria'.
     */
    public int getPorcentajeBateria() {
        return porcentajeBateria;
    }

    /**
     * Método que nos devuelve el valor del atributo 'encendido'.
     * @return nos devuelve el valor del atributo 'encendido'.
     */
    public boolean getEncendido() {
        return encendido;
    }

    /**
     * Método que nos permite asignar de forma controlada un valor nuevo al atributo 'nombreDueno'.
     * @param nuevoDueno Parámetro de tipo cadena String.
     */
    public void setNuevoDueno(String nuevoDueno) {
        nombreDueno = nuevoDueno;
    }

    /**
     * Método que nos permite asignar de forma controlada un valor nuevo al atributo 'porcentajeBateria' mediante una operación matemática.
     * @param carga Parámetro de tipo int.
     */
    public void cargarBateria(int carga) {
        porcentajeBateria = porcentajeBateria + carga;
    }

    /**
     * Método que nos permite cambiar el estado del objeto.
     */
    public void apagado() {
        if (encendido == true) {
            encendido = false;
        }else{
            encendido = true;
        }
    }

    /**
     * Método que nos imprime por pantalla el estado completo el objeto.
     */
    public void imprimirEstado() {
        String estadoOrdenador;
        if (encendido == true) {
            estadoOrdenador = "Si";
        }else{
            estadoOrdenador = "No";
        }
        System.out.println("Dueño: " + nombreDueno + " | Porcentaje de Bateria: " + porcentajeBateria + "% | Encendido: " + estadoOrdenador);
    }

    /**
     * Método que nos devuelve una concatenación de String.
     * @return devuelve por pantalla una concatenación de String con el estado del objeto.
     */
    public String getEstado() {
        String estadoOrdenador;
        if (encendido == true) {
            estadoOrdenador = "Si";
        }else{
            estadoOrdenador = "No";
        }
        return "Dueño: " + nombreDueno + " | Porcentaje de Bateria: " + porcentajeBateria + "% | Encendido: " + estadoOrdenador;
    }
}
