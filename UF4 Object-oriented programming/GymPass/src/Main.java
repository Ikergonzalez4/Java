import obj.Enum.Banned;
import obj.objects.PumpClass;
import obj.objects.SpinningClass;
import obj.utilities.Utilities;
import java.util.Scanner;

import static obj.utilities.Utilities.*;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        String nombre = "";
        String apellido = "";
        String email = "";
        String password = "";
        String email2 = "";
        String password2 = "";


        do {
            opcion = Utilities.menuInt("Introduce una opcion \n " +
                    "1. Registrarse \n " +
                    "2. Iniciar sesion \n " +
                    "3. Salir \n");

            switch (opcion) {
                case 1:
                    System.out.println("REGISTRARSE: ");
                    nombre = getStringWithMaxLength("Introduce el nombre (max. 12 caracteres): ", 12, scanner);
                    apellido = getStringWithMaxLength("Introduce el apellido (max. 50 caracteres): ", 50, scanner);
                    String dni = getDNI("Introduce el dni (8 letras y 1 número): ", scanner);
                    email = getEmail("Introduce el email (max. 50 caracteres, con '@' obligatorio): ", scanner);
                    password = getPassword("Introduce la contraseña (mayúsculas y caracter especial): ", scanner);
                    String telefono = getNumericString("Introduce el teléfono (max. 9 dígitos): ", scanner, 9);
                    String sexo = getGender("Introduce el sexo (hombre/mujer/no binario): ", scanner);
                    String fechaNacimiento = String.valueOf(getFechaNacimiento("Introduce la fecha de nacimiento (yyyy-MM-dd): ", scanner));
                    String direccion = getStringWithMaxLength("Introduce la dirección", 60 , scanner);
                    String codigoPostal = getNumericString("Introduce el código postal (max. 5 caracteres)", scanner, 5);
                    String ciudad = getStringWithMaxLength("Introduce la ciudad", 30 , scanner);
                    break;
                case 2:
                    // opción para iniciar sesión
                    System.out.println("INICIAR SESION:");
                    System.out.println("Introduce el email");
                    email2 = scanner.nextLine();
                    System.out.println("Introduce el password");
                    password2 = scanner.nextLine();
                    if (email2.equals(email) && password2.equals(password)) {
                        System.out.println("Inicio de sesión exitoso");
                        boolean salir = false; // variable de control del bucle del menú del usuario
                        while (!salir) {
                            System.out.println("Bienvenido " + nombre + " " + apellido + "" +
                                    " elije una opcion \n " +
                                    "1. Ver clases de Pump \n " +
                                    "2. Ver clases de Spinning \n " +
                                    "3. Reservar Clase\n " +
                                    "4. Cancelar clase \n " +
                                    "5. Salir \n ");
                            int opcion2 = scanner.nextInt();
                            switch (opcion2) {
                                case 1:
                                    System.out.println("Clases de Pump: ");
                                    PumpClass.printSchedulePump();
                                    break;
                                case 2:
                                    System.out.println("Clases de Spinning:");
                                    SpinningClass.printScheduleSpinning();
                                    break;
                                case 3:
                                    System.out.println("Reservar Clase");
                                    System.out.println("Elige una clase: "
                                            + "1. Pump"
                                            + "2. Spinning");
                                    int opcion3 = scanner.nextInt();
                                    switch (opcion3
                                    ) {
                                        case 1:
                                            System.out.println("Has elegido Pump");
                                            break;
                                        case 2:
                                            System.out.println("Has elegido Spinning");
                                            break;
                                    }
                                    break;
                                case 4:
                                    System.out.println("Cancelar Clase");
                                    break;
                                case 5:
                                    salir = true;
                                    break;
                            }
                        }
                    } else {
                        System.out.println("Inicio de sesión fallido");

                    }
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
            }
        } while (opcion != 3);
    }
}
