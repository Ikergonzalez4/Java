import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerScanner {

    public static void main(String[] args) {

        File f = new File("numeros.txt");

        try {
            Scanner scanner = new Scanner(f);
            int num;

            while(scanner.hasNext()) {
                num = scanner.nextInt();
                System.out.println(num);
            }
        } catch (FileNotFoundException fnfe) {
            throw new RuntimeException(fnfe);
        }


    }
}
