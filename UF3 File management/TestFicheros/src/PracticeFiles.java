import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PracticeFiles {

    public static void main(String[] args) {

        System.out.println("Working directory = " + System.getProperty("user.dir"));
        listarFicheros("C:\\Users\\ikerg\\IdeaProjects\\GithubJava\\UF3 File management");
        contarPalabras(new File("C:\\Users\\ikerg\\IdeaProjects\\GithubJava\\UF3 File management\\TestFicheros\\prueba.txt"));
    }

    // Método que recibe la ruta de un directorio y lista todos los ficheros que se encuentran en él
    public static void listarFicheros(String rutaDirectorio) {
        // Creamos un objeto File con la ruta del directorio
        File directorio = new File(rutaDirectorio);

        // Comprobamos que el objeto File se refiere a un directorio válido
        if (directorio.isDirectory()) {
            // Obtenemos un array con todos los ficheros del directorio
            File[] ficheros = directorio.listFiles();

            // Recorremos el array para mostrar el nombre de cada fichero
            for (File fichero : ficheros) {
                System.out.println(fichero.getName());
            }
        } else {
            System.out.println("La ruta especificada no corresponde a un directorio válido.");
        }
    }
    private static void contarPalabras(String[] args) {

    if (args.length < 1) {
        System.out.println("Debes proporcionar la ruta del archivo como argumento.");
        return;
    }
    String rutaArchivo = args[0];
    File archivo = new File(rutaArchivo);
        if (!archivo.exists()) {
        System.out.println("El archivo no existe.");
        return;
    }
    int numPalabras = contarPalabras(archivo);
        System.out.println("El archivo contiene " + numPalabras + " palabras.");
    }

    private static int contarPalabras(File archivo) {
        int numPalabras = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] palabras = linea.split("\\s+");
                numPalabras += palabras.length;
                System.out.println("El archivo contiene " + palabras.length + " palabras.");
            }
        } catch (IOException e) {
            System.out.println("Se produjo un error al leer el archivo.");
        }
        return numPalabras;
    }
}
