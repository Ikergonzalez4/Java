import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    final static String MENU_PRINCIPAL = "\n\t1. Consultar Biblioteca\n\t2. Consultar titulo\n\t3. Añadir libro\n\t4. Eliminar libro\n\t5. Modificar libro\n\t6. Reiniciar Biblioteca\n\t7. Salir";

    public static void main(String[] args) {
        ArrayList<String> libros;
        libros = bibliotecaInit();

        int opcionMenuPrincipal = 0;

        do {
            System.out.println("Bienvenido/a al programa");
            opcionMenuPrincipal = leerEntero(MENU_PRINCIPAL, 1, 7);

            switch (opcionMenuPrincipal) {
                case 1:
                    imprimirBiblioteca(libros);
                    break;
                case 2:
                    consultarLibro(libros);
                    break;
                case 3:
                    libros = añadirLibro(libros);
                    break;
                case 4:
                    libros = eliminarLibro(libros);
                    break;
                case 5:
                    modificarLibro(libros);
                    break;
                case 6:
                    libros = reiniciarBiblioteca(libros);
                    break;
                case 7:
                    libros = reiniciarBiblioteca(libros);
                    System.out.println("Adéu");
                    break;
            }
        } while (opcionMenuPrincipal != 7);
    }

    /**
     * Metodo para añadir algunos libros en la biblioteca
     *
     * @return Biblioteca inicializada
     */
    private static ArrayList<String> bibliotecaInit() {
        ArrayList<String> biblioteca = new ArrayList<>();
        biblioteca.add("Tirant Lo Blanc");
        biblioteca.add("Solitud");
        biblioteca.add("El Quijote");
        biblioteca.add("Sapiens");
        biblioteca.add("Teo va al cole");
        biblioteca.add("Jumanji");
        biblioteca.add("Spiderman: No way home");
        biblioteca.add("Harry Potter y el caliz de fuego");
        return biblioteca;
    }

    /**
     * Reiniciar biblioteca
     *
     * @param libros
     * @return
     */
    private static ArrayList<String> reiniciarBiblioteca(ArrayList<String> libros) {
        libros.clear();
        return libros;
    }

    /**
     * Metodo para imprimir todos los titulos de los libros por pantalla
     *
     * @param libros
     */
    private static void imprimirBiblioteca(ArrayList<String> libros) {
        for (String libro : libros) {
            System.out.println(libro);
        }
    }

    /**
     * Este metodo sirve para leer un entero por teclado con control de errores.
     *
     * @param menuPrincipal: Sirve para pasarle el texto a mostrar del menú.
     * @param min:           Valor minimo aceptado
     * @param max:           Valor maximo acceptado
     * @return : devuelve un entero que es el valor introducido por teclado.
     */
    public static int leerEntero(String menuPrincipal, int min, int max) {
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        boolean valorCorrecto
                = false;
        do {
            System.out.println(menuPrincipal);
            try {
                opcion = leer.nextInt();
                if (opcion >= min && opcion <= max) {
                    valorCorrecto = true;
                } else {
                    System.out.println("Valor incorrecto. Vuelve a introducir un valor");
                }
            } catch (Exception e) {
                System.out.println("Valor incorrecto. Vuelve a introducir un valor");
                leer.next();
            }
            return opcion;
        } while (!valorCorrecto);
    }

    /**
     * Metodo para consultar un libro
     *
     * @param libros
     */
    private static void consultarLibro(ArrayList<String> libros) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce el nombre del libro a consultar");
        String titulo = leer.nextLine();
        if (libros.contains(titulo)) {
            System.out.println("El libro " + titulo + " existe");
        } else {
            System.out.println("El libro " + titulo + " no existe");
        }

    }

    /**
     * Metodo para añadir un libro
     *
     * @param libros
     */

    private static ArrayList<String> añadirLibro(ArrayList<String> libros) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce el titulo del libro que quieres añadir");
        String titulo = leer.nextLine();
        if (libros.contains(titulo)) {
            System.out.println("El libro " + titulo + " ya existe");
        } else {
            libros.add(titulo);
            System.out.println("El libro " + titulo + " se ha añadido correctamente");
        }
        return libros;
    }

    /**
     * Mètode pera eliminar un libro
     *
     * @param libros
     */

    private static ArrayList<String> eliminarLibro(ArrayList<String> libros) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce le titulo del libro a eliminar");
        String titulo = leer.nextLine();
        if (libros.contains(titulo)) {
            libros.remove(titulo);
            System.out.println("El libro " + titulo + " se ha eliminado correctamente");
        } else {
            System.out.println("El libro " + titulo + " no existe");
        }
        return libros;
    }

    /**
     * Metodo pera modificar un libro
     *
     * @param libros
     */

    private static void modificarLibro(ArrayList<String> libros) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce el titulo del libro a modificar");
        String titulo = leer.nextLine();
        if (libros.contains(titulo)) {
            System.out.println("Introduce el nuevo titulo del libro");
            String nouTitol = leer.nextLine();
            int posicio = libros.indexOf(titulo);
            libros.set(posicio, nouTitol);
            System.out.println("El libro " + titulo + " se ha modificado correctamente");
        } else {
            System.out.println("El libro " + titulo + " no existe");
        }
    }
}



