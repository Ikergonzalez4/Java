import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadandWriteFiles {
    public static void main(String[] args) {
        readFile();
        writeFile();
    }

    private static void readFile() {
        try {
            File file = new File("C:\\Users\\ikerg\\IdeaProjects\\GithubJava\\UF3 File management\\TestFicheros\\prueba.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));

            String st;
            while ((st = br.readLine()) != null)
                System.out.println(st);
            br.close();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Por favor, ingrese el nombre del archivo como argumento en la línea de comandos.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    private static void writeFile() {

        }
}

