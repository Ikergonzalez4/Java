package Ex_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {
    static String filePath;
    static  Scanner scanner = new Scanner(System.in);
    static ArrayList<String> lines = new ArrayList<>();
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        System.out.println("Introduce la ruta de un fichero: ");
        filePath = scanner.nextLine();
        readFile();
    }

    private static void readFile() {

        try{
            File file = new File(filePath);
            Scanner input = new Scanner(file);
            input.hasNextLine();
            while (input.hasNextLine()) {
                lines.add(input.nextLine());
            }
            writeFile();
        }catch (FileNotFoundException fnfe){
            System.out.println("Error al leer el archivo: " + fnfe.getMessage());
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        } catch (Throwable t){
            System.out.println("Error: " + t.getMessage());
        } finally {
            System.out.println("Fin del programa");
        }

    }

    private static void writeFile() {

        System.out.println("Introduce el nombre del fichero de salida: ");
        String fileName = scanner.nextLine();
        File file = new File(fileName);
        try {
            java.io.PrintWriter output = new java.io.PrintWriter(file);
            for (String line : lines) {
                output.println(line.toUpperCase());
            }
            output.close();
        } catch (Exception e) {
            System.out.println("Error al crear el fichero: " + e.getMessage());
        }
    }
}
