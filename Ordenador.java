
public class Ordenador {

    private String nombreDueno;
    private int porcentajeBateria;
    private boolean encendido;

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
}
