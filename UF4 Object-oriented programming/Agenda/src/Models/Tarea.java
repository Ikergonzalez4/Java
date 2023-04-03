package Models;

import java.time.LocalTime;

public class Tarea {

    private LocalTime horaInicio;
    private LocalTime horaFin;
    private boolean estaHecha;
    String descripcion;

    public Tarea(LocalTime horaInicio, LocalTime horaFin, String descripcion, boolean estaHecha) {
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.descripcion = descripcion;
        this.estaHecha = false;
    }

    /**
     * Getter para la hora inicio
     * @return the horaInicio
     */
    public LocalTime getHoraInicio() {
        return this.horaInicio;
    }

    /**
     * Getter para la hora fin
     * @return the horaFin
     */
    public LocalTime getHoraFin() {
        return this.horaFin;
    }

    /**
     * Getter para la descripcion
     * @return the estaHecha
     */
    public String getDescripcion() {
        return this.descripcion;
    }


}
