import java.util.ArrayList;

public class Biblioteca{
    //array list de libros
    public ArrayList<Libro> catalago = new ArrayList<>();
    public String direccion;
    public String nombreBiblio;

    public Biblioteca(String nombreBiblio, String direccion){

        this.nombreBiblio = nombreBiblio;
        this.direccion = direccion;

    }
}