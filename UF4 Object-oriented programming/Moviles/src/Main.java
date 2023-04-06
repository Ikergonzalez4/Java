public class Main {

    public static void main(String[] args) {

        Movil movil1 = new Movil("Samsung", "Galaxy S10", "Negro", 3, 2);
        Movil movil2 = new Movil ("Iphone", "X", "Blanco", 2);

        System.out.println("MOVIL 1");
        System.out.println("Marca: " + movil1.marca);
        System.out.println("Modelo: " + movil1.modelo);
        System.out.println("Color: " + movil1.color);
        System.out.println("Numero de camaras: " + movil1.numCamara);
        System.out.println("Numero de sim: " + movil1.numSim);

        System.out.println("MOVIL 2");
        System.out.println("Marca: " + movil2.marca);
        System.out.println("Modelo: " + movil2.modelo);
        System.out.println("Color: " + movil2.color);
        System.out.println("Numero de camaras: " + movil2.numCamara);
        System.out.println("Numero de sim: " + movil2.numSim);

    }
}
