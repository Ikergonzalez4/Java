public class Main {

    public static void main(String[] args) {
        // Crear un objeto de la clase Libro
        Libro libro1 = new Libro("El principito", "Antoine de Saint-Exupéry", "Infantil", 100, 123456789);
        // Crear un objeto de la clase Biblioteca
        Biblioteca biblio1 = new Biblioteca("Calle 1", "Biblioteca 1");
        // Asignar valores a los atributos del objeto
        /*biblio1.direccion = "Calle 1";
        biblio1.nombreBiblio = "Biblioteca 1";*/
        // Agregar el libro al array list
        biblio1.catalago.add(libro1);
        // Crear un objeto de la clase Biblioteca
        Biblioteca biblio2 = new Biblioteca("Calle 2", "Biblioteca 2");
        // Asignar valores a los atributos del objeto
        /*biblio2.direccion = "Calle 2";
        biblio2.nombreBiblio = "Biblioteca 2";*/
        // Agregar el libro al array list
        biblio2.catalago.add(libro1);
        // Imprimir los datos del libro
        System.out.println("Titulo: " + libro1.titulo);
        System.out.println("Autor: " + libro1.autor);
        System.out.println("Tema: " + libro1.tema);
        System.out.println("Numero de paginas: " + libro1.numPaginas);
        System.out.println("ISBN: " + libro1.ISBN);
        // Imprimir los datos de la biblioteca
        System.out.println("Direccion: " + biblio1.direccion);
        System.out.println("Nombre de la biblioteca: " + biblio1.nombreBiblio);
        // Imprimir los datos de la biblioteca
        System.out.println("Direccion: " + biblio2.direccion);
        System.out.println("Nombre de la biblioteca: " + biblio2.nombreBiblio);
    }
}
