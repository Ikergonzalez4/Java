public class CocheDeportivo extends Coche{

    public int velocidad;

    //constructor
    public CocheDeportivo(String marca, String modelo, double precio, int velocidad) {
        super(marca, modelo, precio);
        this.velocidad = velocidad;
    }

    public void mostrarVelocidadMaxima() {
        System.out.println("Velocidad máxima: " + velocidad + " km/h");
    }
}
