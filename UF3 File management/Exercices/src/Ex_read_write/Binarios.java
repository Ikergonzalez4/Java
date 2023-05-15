package Ex_read_write;

import java.io.*;

public class Binarios {

    public static void main(String[] args) {

        File ficheroBinario = new File("C:\\Users\\ikerg\\IdeaProjects\\Github\\UF3 File management\\Exercices\\src\\ficheroBinario.dat");
        escribirBinario(ficheroBinario);
        //leerTextoPlano(ficheroBinario);
        try {
            deserializar(new FileInputStream("C:\\Users\\ikerg\\IdeaProjects\\Github\\UF3 File management\\Exercices\\src\\ficheroBinario.dat"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void escribirBinario(File ficheroBinario) {

        Persona p1 = new Persona("iker", 18);

        FileOutputStream fos = null;
        ObjectOutputStream ois = null;

        try {
            fos = new FileOutputStream(ficheroBinario);
            ois = new ObjectOutputStream(fos);

            ois.writeObject(p1);
            ois.close();
            fos.close();
        } catch (IOException ioe) {
            System.out.println("Excepcion predeterminada: " + ioe.getMessage());

        }
    }

    private static void leerTextoPlano(File ficheroBinario) {

        try {
            BufferedReader br = new BufferedReader(new FileReader(ficheroBinario));

            while (true) {
                String valor = br.readLine();
                if (valor == null) {
                    break;
                }
                System.out.println(valor);
            }


        } catch (Exception ioe) {
            System.out.println("a");
        }
    }

    private static void deserializar(FileInputStream ficheroBinario) {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(ficheroBinario); // input leer
            Persona object = (Persona) objectInputStream.readObject();
            // Object object = objectInputStream.readObject();


            System.out.println(object.toString());
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void editarBinarios (File ficheroBinario) {
        Persona p1 = new Persona("iker", 18);

        FileInputStream fis = null;
        ObjectInputStream  ois = null;
        FileOutputStream fos = null;
        ObjectOutputStream ous = null;

        try {
            fis = new FileInputStream(ficheroBinario);
            ois = new ObjectInputStream(fis);

            Persona object = (Persona) ois.readObject();
            p1.setEdad(3);
            p1.setNombre("Pablo");

            fos = new FileOutputStream(ficheroBinario);
            ous = new ObjectOutputStream(fos);

            ous.writeObject(p1);

        } catch (Exception e) {

        } finally {

        }
    }
}
