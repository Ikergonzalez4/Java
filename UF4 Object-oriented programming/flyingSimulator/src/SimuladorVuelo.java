import java.util.ArrayList;
import java.util.Scanner;

public class SimuladorVuelo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Avion avion1 = new Avion("Boeing 747", 900, new ArrayList<Integer>());
        Avion avion2 = new Avion("Boeing 345", 10, new ArrayList<Integer>());
        Avion avion3 = new Avion("Boeing 6345", 200, new ArrayList<Integer>());
        Avion avion4 = new Avion("Boeing 223", 130, new ArrayList<Integer>());
        Avion avion5 = new Avion("Boeing 999", 50, new ArrayList<Integer>());

        Vuelo vuelo1 = new Vuelo("Bogota", "Medellin", "2020-10-10", 100);
        Vuelo vuelo2 = new Vuelo("Valencia", "New York", "2023-05-15", 100);
        Vuelo vuelo3 = new Vuelo("Australia", "Barcelona", "2021-09-01", 100);
        Vuelo vuelo4 = new Vuelo("Malaga", "Medellin", "2019-09-23", 100);
        Vuelo vuelo5 = new Vuelo("Islandia", "Nueva Zelanda", "2024-12-12", 100);

        System.out.println("Bienvenido al simulador de vuelo");
        System.out.println("1. Mostrar todos los vuelos \n" +
                " 2. Mostrar todos los aviones \n" +
                " 3. Reservar asiento \n" +
                " 4. Mostrar pasajeros de un vuelo \n" +
                " 5. Salir");
        while (true) {
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Vuelos disponibles: ");
                    System.out.println("Vuelo 1: " + vuelo1.getOrigen() + " - " + vuelo1.getDestino() + " - " + vuelo1.getFechaSalida());
                    System.out.println("Vuelo 2: " + vuelo2.getOrigen() + " - " + vuelo2.getDestino() + " - " + vuelo2.getFechaSalida());
                    System.out.println("Vuelo 3: " + vuelo3.getOrigen() + " - " + vuelo3.getDestino() + " - " + vuelo3.getFechaSalida());
                    System.out.println("Vuelo 4: " + vuelo4.getOrigen() + " - " + vuelo4.getDestino() + " - " + vuelo4.getFechaSalida());
                    System.out.println("Vuelo 5: " + vuelo5.getOrigen() + " - " + vuelo5.getDestino() + " - " + vuelo5.getFechaSalida());
                    break;
                case 2:
                    System.out.println("Aviones disponibles: ");
                    System.out.println("Avion 1: " + avion1.getModelo());
                    System.out.println("Avion 2: " + avion2.getModelo());
                    System.out.println("Avion 3: " + avion3.getModelo());
                    System.out.println("Avion 4: " + avion4.getModelo());
                    System.out.println("Avion 5: " + avion5.getModelo());
                    break;
                case 3:
                    //reservar asiento
                    System.out.println("Ingrese el numero de vuelo: ");
                    int numeroVuelo = scanner.nextInt();
                    System.out.println("Ingrese el nombre del pasajero: ");
                    String nombrePasajero = scanner.next();
                    System.out.println("Ingrese el apellido del pasajero: ");
                    String apellidoPasajero = scanner.next();
                    System.out.println("Necesita asistencia especial? (true/false): ");
                    boolean asistenciaEspecial = scanner.nextBoolean();
                    System.out.println("Ingrese el numero de asiento: ");
                    int numeroAsiento = scanner.nextInt();

                    break;
                case 4:
                    //mostrar pasajeros de un vuelo
                    System.out.println("Ingrese el numero de vuelo: ");
                    int numeroVuelo2 = scanner.nextInt();
                    System.out.println("Pasajeros del vuelo: ");
                    System.out.println("Falta por implementar");
                    //TODO mostrar pasajeros del vuelo
                    break;
                case 5:
                    System.out.println("Gracias por usar el simulador de vuelo");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
    }
}
