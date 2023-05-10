import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter {

    public static void main(String[] args) {

        String texto = "Esto es una prueba de escritura en un fichero";
        String texto2 = "Esto es la segunda prueba de escritura en un fichero";


        try (BufferedWriter bw = new BufferedWriter(new FileWriter("fichero2.txt", true))){

            bw.write(texto);
            bw.newLine();
            bw.write(texto2);
        } catch (IOException ioe) {
            System.out.println("Error de E/S");
        }
    }
}
