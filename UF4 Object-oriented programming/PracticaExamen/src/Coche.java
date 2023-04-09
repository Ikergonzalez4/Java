public class Coche {

    public String marca;
    public String modelo;
    public double precio;

    //constructor
    public Coche(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    //mostrar info coche
    public void mostrarInfoCoche() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Precio: " + precio);
    }

}
