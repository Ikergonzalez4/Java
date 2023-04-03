package Models;

import java.time.Year;
import java.util.Random;

public class Agenda {
    public Year anio;

    public Pagina[] paginas;

    private int candado;
    public Agenda (Year anio, Pagina[] paginas) {
        this.anio = anio;
        paginas = new Pagina[365];
    }

    public void setCandado(int combinacion){
        Random x = new Random();
        combinacion += x.nextInt();
        this.candado = combinacion;
    }

    /*devuelve la combinacion del candado*/
    public int getCandado(){
        return this.candado;
    }
}
