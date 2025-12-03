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

    public Ordenador(String elNombre, int laBateria) {
        nombreDueno = elNombre;
        porcentajeBateria = laBateria;
        encendido = true;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public int getPorcentajeBateria() {
        return porcentajeBateria;
    }

    public boolean getEncendido() {
        return encendido;
    }

    public void setNuevoDueno(String nuevoDueno) {
        nombreDueno = nuevoDueno;
    }

    public void cargarBateria(int carga) {
        porcentajeBateria = porcentajeBateria + carga;
    }

    public void apagado() {
        if (encendido == true) {
            encendido = false;
        }else{
            encendido = true;
        }
    }

    public void imprimirEstado() {
        System.out.println("Dueño: " + nombreDueno);
        System.out.println("Porcentaje de Bateria: " + porcentajeBateria + "%");
        System.out.println("Encendido: " + encendido);
    }

    public String getEstado() {
        return "Dueño: " + nombreDueno + " | Porcentaje de Bateria: " + porcentajeBateria + "% | Encendido: " + encendido;
    }
}
