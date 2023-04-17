import java.util.ArrayList;

public class Vuelo {
    protected String origen;
    protected String destino;
    protected String fechaSalida;
    protected int capacidadMaxima;
    protected ArrayList<Pasajero> pasajeros;

    public Vuelo(String origen, String destino, String fechaSalida, int capacidadMaxima) {
        this.origen = origen;
        this.destino = destino;
        this.fechaSalida = fechaSalida;
        this.capacidadMaxima = capacidadMaxima;
        this.pasajeros = new ArrayList<Pasajero>();
    }

    //metodo para asignar asiento


    //metodo para reservar asiento


    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public ArrayList<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public boolean agregarPasajero(Pasajero pasajero) {
        if (pasajeros.size() < capacidadMaxima) {
            pasajeros.add(pasajero);
            return true;
        } else {
            return false;
        }
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setPasajeros(ArrayList<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }
}
