package obj.utilities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Utilities {
    public static String getString(String text) {
        System.out.println(text);
        return new Scanner(System.in).nextLine();
    }

    public static int menuInt(String text) {
        Scanner llegir = new Scanner(System.in);
        boolean tipusCorrecte = false;
        int valor = 0;

        do {
            System.out.println(text);
            tipusCorrecte = llegir.hasNextInt();
            if (!tipusCorrecte){
                System.out.println("Valor no numèric");
            }else{
                valor = llegir.nextInt();
            }
            llegir.nextLine();
        }while(!tipusCorrecte);
        return valor;

    }

    public static String llegirString(String text) {
        Scanner llegir = new Scanner(System.in);
        boolean tipusCorrecte = false;
        String valor = "";

        do {
            System.out.println(text);
            tipusCorrecte = llegir.hasNextLine();
            if (!tipusCorrecte){
                System.out.println("Valor no numèric");
            }else{
                valor = llegir.nextLine();
            }
            llegir.nextLine();
        }while(!tipusCorrecte);
        return valor;

    }

    public static float getDouble(String text) {
        System.out.println(text);
        return new Scanner(System.in).nextFloat();
    }

    public static int getInt(String text) {
        System.out.println(text);
        return new Scanner(System.in).nextInt();
    }

    public static String getStringWithMaxLength(String message, int maxLength, Scanner scanner) {
        String input = "";
        do {
            System.out.print(message);
            input = scanner.nextLine();
        } while (input.length() > maxLength);

        return input;
    }

    public static String getNumericString(String message, Scanner scanner, int maxLength) {
        String regex = "\\d{" + maxLength + "}";
        String input = "";
        do {
            System.out.print(message);
            input = scanner.nextLine();
        } while (!input.matches(regex));

        return input;
    }


    public static String getDNI(String message, Scanner scanner) {
        String regex = "^[0-9]{8}[a-zA-Z]$";
        String input = "";
        do {
            System.out.print(message);
            input = scanner.nextLine();
        } while (!input.matches(regex));

        return input;
    }

    public static String getEmail(String message, Scanner scanner) {
        String regex = "^\\S+@\\S+\\.\\S+$";
        String input = "";
        do {
            System.out.print(message);
            input = scanner.nextLine();
        } while (!input.matches(regex));

        return input;
    }

    public static String getPassword(String message, Scanner scanner) {
        String regex = "^(?=.*[A-Z])(?=.*[!@#$&*])(?=\\S+$).{8,}$";
        String input = "";
        do {
            System.out.print(message);
            input = scanner.nextLine();
            if (!input.matches(regex)) {
                System.out.println("La contraseña debe tener al menos 8 caracteres, una mayúscula y un caracter especial");
            }
        } while (!input.matches(regex));

        return input;
    }
    public static String getGender(String message, Scanner scanner) {
        String input = "";
        do {
            System.out.print(message);
            input = scanner.nextLine();
        } while (!input.equalsIgnoreCase("hombre") && !input.equalsIgnoreCase("mujer") && !input.equalsIgnoreCase("no binario"));

        return input;
    }
    public static LocalDate getFechaNacimiento(String message, Scanner scanner) {
        LocalDate fechaNacimiento = null;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        boolean validInput = false;
        while (!validInput) {
            System.out.print(message);
            String input = scanner.nextLine();
            try {
                fechaNacimiento = LocalDate.parse(input, formatter);
                validInput = true;
            } catch (DateTimeParseException e) {
                System.out.println("Fecha invalida. Por favor ingrese una fecha con formato yyyy-MM-dd.");
            }
        }
        return fechaNacimiento;
    }
}
