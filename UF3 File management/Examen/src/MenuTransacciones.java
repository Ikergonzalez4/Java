import java.io.*;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuTransacciones {

    public static void registrarTransaccion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre del archivo: ");
        String nombreArchivo = scanner.nextLine();

        try {
            FileWriter archivo = new FileWriter(nombreArchivo, true);

            System.out.print("Introduce el tipo de criptomoneda (BTN, ETH, ADA, USDT, DND, DOT, XRP, LTC): ");
            String criptomoneda = scanner.nextLine();

            // Validar que la criptomoneda sea válida
            String[] criptosValidas = {"BTN", "ETH", "ADA", "USDT", "DND", "DOT", "XRP", "LTC"};
            boolean esValida = false;
            for (String cripto : criptosValidas) {
                if (criptomoneda.equalsIgnoreCase(cripto)) {
                    esValida = true;
                    break;
                }
            }
            if (!esValida) {
                System.out.println("No disponemos de esa criptomoneda en CryptoVault.\nTransacción no registrada.");
                archivo.close();
                return;
            }

            System.out.print("Introduce el importe: ");
            double importe = scanner.nextDouble();

            if (importe <= 0) {
                System.out.println("Importe inválido. Transacción no registrada.");
                archivo.close();
                return;
            }

            String fecha = LocalDate.now().toString();
            String detalles = criptomoneda + " - " + importe + " - " + fecha;
            archivo.write(detalles + "\n");
            archivo.close();

            System.out.println("Transacción registrada correctamente en CryptoVault.");

            } catch (FileNotFoundException fnfe) {
                System.out.println("No se encontró el archivo." + fnfe.getMessage());
            } catch (ArithmeticException ae) {
                System.out.println("Error aritmético." + ae.getMessage());
            } catch (InputMismatchException ime) {
                System.out.println("Error de entrada." + ime.getMessage());
            } catch (IOException ioe) {
                System.out.println("Error al abrir o escribir en el archivo." + ioe.getMessage());
            } catch (Exception e) {
                System.out.println("Ocurrió un error durante la transacción." + e.getMessage());
            } finally {
                System.out.println("Fin de la transacción.");
            }
        }

    public static void verTransacciones() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre del archivo: ");
        String nombreArchivo = scanner.nextLine();

        try {
            FileReader archivo = new FileReader(nombreArchivo);
            BufferedReader lector = new BufferedReader(archivo);

            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
            archivo.close();

        } catch (FileNotFoundException fnfe) {
            System.out.println("No se encontró el archivo." + fnfe.getMessage());
        } catch (EOFException eof) {
            System.out.println("Fin del archivo." + eof.getMessage());
        } catch (IOException e) {
            System.out.println("Error al abrir el archivo.");
        } catch (Exception e) {
            System.out.println("Ocurrió un error." + e.getMessage());
        } finally {
            System.out.println("Fin de la lectura del archivo.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("---- Bienvenido a CryptoVault ----");
            System.out.println("1. Registrar una transacción");
            System.out.println("2. Ver transacciones");
            System.out.println("3. Salir y despedirse");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    registrarTransaccion();
                    break;
                case 2:
                    verTransacciones();
                    break;
                case 3:
                    System.out.println("¡Hasta luego y muchas gracias por confiar en CryptoVault!");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.");
                    break;
            }
        } while (opcion != 3);
    }
}
