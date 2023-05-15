package Ex_read_write;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LeerArchivos {

    public static void main(String[] args) {


        File fichero = new File("texto.txt");
        try {
            Scanner scanner = new Scanner(fichero); //leer fichero con scanner
            scanner.nextLine().charAt(1);

            FileWriter fw = new FileWriter(fichero); // escribir fichero
            fw.write("Hola");

        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
