import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int salario;

        //numbers();
        try {
            System.out.println("Introduce el salario del empleado: ");
             salario = scanner.nextInt();  // Read user input
            Empleado empleado = new Empleado("Juan", salario);
            // Si se llega aquí, es que no ha habido excepción y se ha creado el objeto correctamente
            System.out.println("Se ha creado el empleado: " + empleado.getNombre() + " con salario: " + empleado.getSalario());
        } catch (SalarioNegativoException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void numbers() {
        int[] numeros = new int[5];

        try {
            numeros[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Se ha producido un desbordamiento de índice.");
        }
    }

    // Clase de la excepción personalizada
    public static class SalarioNegativoException extends Exception {
        public SalarioNegativoException(String mensaje) {
            super(mensaje);
        }
    }

    // Clase Empleado que utiliza la excepción personalizada
    public static class Empleado {
        private String nombre;
        private int salario;

        public Empleado(String nombre, int salario) throws SalarioNegativoException {
            if (salario < 0) {
                throw new SalarioNegativoException("El salario no puede ser negativo");
            }
            this.nombre = nombre;
            this.salario = salario;
        }

        public String getNombre() {
            return nombre;
        }

        public int getSalario() {
            return salario;
        }
    }
}