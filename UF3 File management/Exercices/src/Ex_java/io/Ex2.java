package Ex_java.io;

import com.sun.tools.javac.Main;

import java.io.File;

public class Ex2 {

    public static void main(String[] args) {
        Ex2 programa = new Ex2();
        programa.inicio();
    }

    public void inicio() {
        // Rutas absolutas
        File directoryAbsPath = new File("c:/Temp");
        File fileAbsPath = new File("c:/Temp/data.txt");

        // Rutas relativas
        File directoryRelativePath = new File("Temp");
        File fileRelativePath = new File("Temp/data.txt");

        // Mostramos información para cada ruta
        showPaths(directoryAbsPath, false);
        showPaths(fileAbsPath, false);
        showPaths(directoryRelativePath, true);
        showPaths(fileRelativePath, true);
    }

    public void showPaths(File f, boolean relativePath) {
        System.out.println("**********************************");
        if (relativePath) {
            System.out.println("La ruta es " + f.getAbsolutePath());
        }
        System.out.println("Su padre es " + f.getParent());
        System.out.println("Su nombre es " + f.getName());
    }
}
