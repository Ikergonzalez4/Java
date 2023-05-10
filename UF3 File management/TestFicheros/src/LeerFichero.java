import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {

    public static void main(String[] args) {

        String contenido = "";
        int caracter;

        System.out.println("Working directory = " + System.getProperty("user.dir"));

        try {
            FileReader fr = new FileReader("fichero.txt");

            caracter = fr.read();
            while (caracter != -1 ) {
                contenido += (char) caracter;
                caracter = fr.read();
            }

        } catch (IOException ioe) {
            throw new RuntimeException(ioe);
        }

        System.out.println("El contenido del fichero es: " + contenido);
    }
}
