package Ex_Exceptions;

import java.util.*;

public class Ex3 {

    private static String[] users;
    private static int userLimitLength = 15;
    private static List<String> names =
            Arrays.asList("ANTONIO","JOSE","...");
    private static List<String> surnames =
            Arrays.asList("GARCIA","GONZALEZ","...");
    private static List<String> checkedUsers = new ArrayList<>();

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.println("Bienvenido al generador de usuarios.");
        System.out.println("¿Cuántos usuarios necesitas?");
        int quantity = entry.nextInt();
        users = generate(quantity); // Generar usuarios aleatorios

        // Agregar nombres de users array a checkedUsers con comprobaciones
        for (String name : users) {
            try {
                checkUser(name); // Comprobar si el nombre ya existe en checkedUsers y si no sobrepasa userLimitLength
                checkedUsers.add(name);
            } catch (DuplicateNameException e) { // Capturar excepción si el nombre ya existe
                System.out.println("Error: " + e.getMessage() + " ya existe en checkedUsers.");
            } catch (NameLengthExceededException e) { // Capturar excepción si el nombre sobrepasa userLimitLength
                System.out.println("Error: " + e.getMessage() + " sobrepasa el límite de caracteres de " + userLimitLength);
                System.exit(1); // Salir del programa con código de error 1
            }
        }
    }

    private static String[] generate(int quantity) {
        String[] usersnew = new String[quantity];
        for (int j = 0; j < usersnew.length; j++) usersnew[j] = getName(); // Generar un nombre aleatorio para cada usuario
        return usersnew;
    }

    private static String getName() {
        Random rand = new Random();
        return String.format("%s %s %s",
                names.get(rand.nextInt(names.size())), // Escoger un nombre aleatorio de la lista de nombres
                surnames.get(rand.nextInt(surnames.size())), // Escoger un primer apellido aleatorio de la lista de apellidos
                surnames.get(rand.nextInt(surnames.size()))); // Escoger un segundo apellido aleatorio de la lista de apellidos
    }

    private static void checkUser(String name) throws DuplicateNameException, NameLengthExceededException {
        // Comprobar si el nombre ya existe en checkedUsers
        if (checkedUsers.contains(name)) {
            throw new DuplicateNameException(name); // Lanzar excepción personalizada si el nombre ya existe
        }
        // Comprobar si el nombre sobrepasa userLimitLength
        if (name.length() > userLimitLength) {
            throw new NameLengthExceededException(name); // Lanzar excepción personalizada si el nombre sobrepasa userLimitLength
        }
    }

    // Excepción personalizada para nombres duplicados
    static class DuplicateNameException extends Exception {
        public DuplicateNameException(String name) {
            super(name);
        }
    }

    // Excepción personalizada para nombres que sobrepasan userLimitLength
    static class NameLengthExceededException extends RuntimeException {
        public NameLengthExceededException(String name) {
            super(name);
        }
    }
}
