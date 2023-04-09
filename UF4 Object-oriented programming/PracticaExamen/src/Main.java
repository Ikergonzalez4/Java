public class Main {
    public static void main(String[] args) {
        System.out.println("Coche deportivo");
        CocheDeportivo cocheDeportivo = new CocheDeportivo("Ferrari", "458 Italia", 220000, 325);
        cocheDeportivo.mostrarInfoCoche();
        cocheDeportivo.mostrarVelocidadMaxima();

        System.out.println("Coche normal");
        System.out.println("==============");
        Coche miCoche = new Coche("Ford", "Mustang", 25000);
        miCoche.mostrarInfoCoche();

    }
}
