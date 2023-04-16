import java.util.ArrayList;

public class Avion {

    private String modelo;
    private int capacidadMaxima;

    private ArrayList<Integer> asientosDisponibles;

    public Avion(String modelo, int capacidadMaxima, ArrayList<Integer> asientosDisponibles) {
        this.modelo = modelo;
        this.capacidadMaxima = capacidadMaxima;
        this.asientosDisponibles = asientosDisponibles;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public ArrayList<Integer> getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public boolean asignarAsiento(int asiento) {
        if (asientosDisponibles.contains(asiento)) {
            asientosDisponibles.remove(asientosDisponibles.indexOf(asiento));
            return true;
        } else {
            return false;
        }
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setAsientosDisponibles(ArrayList<Integer> asientosDisponibles) {
        this.asientosDisponibles = asientosDisponibles;
    }
}
