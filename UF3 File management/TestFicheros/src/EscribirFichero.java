import java.io.FileWriter;
import java.io.IOException;

public class EscribirFichero {

    public static void main(String[] args) {

        System.out.println("Working directory = " + System.getProperty("user.dir"));

        // (append = true) es para añadir al final del fichero sin borrar lo que ya hay
        try (FileWriter fw = new FileWriter("fichero.txt", true)) {

            fw.write("\nPrueba del fichero "); // Escribir un String con salto de línea
            // fw.close(); // Cerrar siempre el fichero

        }catch (IOException ioe) {
            System.out.println("Error de E/S"); // Capturar excepción de E/S
        }
    }
}
