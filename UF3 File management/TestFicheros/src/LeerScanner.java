import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LeerScanner {

    public static void main(String[] args) {

        System.out.println("Working directory = " + System.getProperty("user.dir"));
        File f = new File("numeros.txt");
        File fSalida = new File("numerosSalida.txt");

        try (Scanner scanner = new Scanner(f);
             Scanner sc_usuario = new Scanner(System.in);
             PrintWriter pw = new PrintWriter(fSalida);) {

            int num;
            int numUsuario;

            System.out.println("Introduce un numero");
            numUsuario = sc_usuario.nextInt();

            System.out.println("============");
            System.out.println("Fichero");
            while(scanner.hasNext()) {
                num = scanner.nextInt();
                if(num > numUsuario){
                    pw.println(num);
                }
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe.getMessage());
        }
    }
}

