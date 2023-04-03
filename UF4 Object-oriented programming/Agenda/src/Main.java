import Models.Agenda;
import Models.Pagina;
import Models.Tarea;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Year;
import java.util.Scanner;

import static jdk.internal.org.jline.utils.Colors.s;


public class Main {

    public static void main(String[] args) {
        Agenda agenda2223 = new Agenda(Year.now(), new Pagina[365]);

        for (int i = 0; i < 365; i++) {
            if (agenda2223.paginas[i] != null) {
                System.out.println(agenda2223.paginas[i].getDia());
            }
        }

    }

    private static Tarea crearTarea(){
        Tarea tareaNueva;
        LocalTime horaInicio = LocalTime.from(leerLocalDate("Hora de inicio"));
        LocalTime horaFin = LocalTime.from(leerLocalDate("Hora de fin"));
        String descripcion = leerString("Descripcion");
        tareaNueva = new Tarea(horaInicio, horaFin, descripcion, false);
        return tareaNueva;
    }

    private static String leerString(String getDescripcion) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(s);
        return scanner.nextLine();
    }

        private static boolean leerBoolean (String s){
            Scanner sc = new Scanner(System.in);
            boolean tipoCorrecto = false;
            boolean esFestivo = false;

            do {
                System.out.println(s);
                tipoCorrecto = sc.hasNextBoolean();

                if (!tipoCorrecto) {
                    System.out.println("Error, el tipo de dato introducido no es correcto.");
                    sc.next();
                } else {
                    esFestivo = sc.nextBoolean();
                }
            } while (!tipoCorrecto);
            return esFestivo;
        }

        private static Pagina crearPagina() {
            Pagina aux;
            System.out.println("Escribe el dia de la pagina");
            LocalDate dia = leerLocalDate("yyyy-mm-dd");
            aux = new Pagina(dia, leerBoolean("¿Es festivo?"), null);
            return aux;
        }

        private static LocalDate leerLocalDate(String s){
            Scanner scanner = new Scanner(System.in);
            String diaTexto = scanner.next();
            scanner.nextLine();

            LocalDate dia = LocalDate.parse(diaTexto);

            return dia;
        }
}

