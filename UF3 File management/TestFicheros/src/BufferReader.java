import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {

    public static void main(String[] args) {


        try(BufferedReader br = new BufferedReader(new FileReader("fichero2txt")) ){

            String linea = "";

            while (linea == br.readLine()){
                System.out.println(linea);
            }

            System.out.println(linea);


        }catch (IOException ioe) {
            System.out.println("Error de E/S");
        }
    }
}
