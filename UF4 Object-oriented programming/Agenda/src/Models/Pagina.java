package Models;

import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;

public class Pagina {

    private LocalDate dia;
    private boolean esFestivo;
    private ArrayList<Tarea> tareas;

    public String nota;

    public Pagina(LocalDate dia, boolean esFestivo, ArrayList<Tarea> tareas) {
        this.dia = dia;
        this.esFestivo = esFestivo;
        tareas = new ArrayList<Tarea>();
    }

    /**
     * Setter que permite informar this.dia de forma controlada
     *
     * @return the dia
     */
    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    /**
     * Getter para el dia
     *
     * @return the dia
     */
    public LocalDate getDia() {
        return this.dia;
    }

    /**
     * Getter para el esFestivo
     *
     * @return
     */
    public boolean getEsFestivo() {
        return this.esFestivo;
    }

    /**
     * Getter para las tareas
     *
     * @return the tareas
     */
    public ArrayList<Tarea> getTareas() {
        return this.tareas;
    }

    @Override
    public String toString() {
        return "{" +
                " dia='" + getDia() + "'" +
                ", esFestivo='" + getEsFestivo() + "'" +
                ", tareas='" + getTareas() + "'" +
                "}";
    }

    public static Agenda initAgenda(Agenda agenda2223) {
        Year anio = agenda2223.anio;

        for (int i = 0; i < agenda2223.paginas.length; i++) {
            agenda2223.paginas[i] = new Pagina(anio.atDay(i + 1), false, null);
        }
        return agenda2223;
    }

    public void setNota(String nota) {
        if (nota.equalsIgnoreCase("idiota")) {
            System.out.println("No puedes poner idiota");
        } else {
            this.nota = nota;
        }
    }
}
