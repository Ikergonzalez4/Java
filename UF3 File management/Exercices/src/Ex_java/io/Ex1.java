package Ex_java.io;

import com.sun.tools.javac.Main;

import java.io.File;

public class Ex1 {

    public static void main(String[] args) {
        inicio();
    }

    public static void inicio() {

        File directoryAbsPath= new File ("c:/Temp");
        File fileAbsPath = new File ("c:/Temp/data.txt");
        File directoryRelativePath = new File("Temp");
        File fileRelativePath = new File("Temp/data.txt");

        showPaths(directoryAbsPath, false);
        showPaths(fileAbsPath, false);
        showPaths(directoryRelativePath, true);
        showPaths(fileRelativePath, true);

    }

    public static void showPaths(File f, boolean relativePath) {
        System.out.println("**********************************");
        if (relativePath) System.out.println("La ruta es " + f.getAbsolutePath());
        System.out.println("Su padre es " + f.getParent());
        System.out.println("Su nombre es " + f.getName());
    }
}
