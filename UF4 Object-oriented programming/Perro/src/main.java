import Objetos.Perro;
import Objetos.Persona;

public class main {

    public static void main(String[] args) {
        Persona p1 = new Persona("Pep", "garcia", 20, "12345678A", "C/ Pep", "123456789", "ikerghc@gmail.cpom");
        Perro g1 = new Perro(1, "Carlos", "Carlino", 2);

        System.out.println(p1.getNom()); // Pep
        System.out.println(p1.getCognom()); // Garcia
        System.out.println(g1.getNom()); // Carlos
        System.out.println(g1.getEdat()); // 2



    }



}
