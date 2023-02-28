import java.util.Scanner;

public class CalculadoraMedia {
    public static void main(String[] args) {
        menuPrincipal();
    }

    public static void menuPrincipal() {
        int size = askVectorSize();
        float[] notes = introduceValues(size);
        float average = calculateAverage(notes);
        System.out.println("La mitjana és: " + average);
        checkPass(average);
    }

    public static int askVectorSize() {
        Scanner sc = new Scanner(System.in);
        int size = 0;
        boolean valid = false;
        while (!valid) {
            System.out.print("Introdueix la mida del vector: ");
            try {
                size = sc.nextInt();
                if (size >= 0 && size <= 10) {
                    valid = true;
                } else {
                    System.out.println("El valor ha de ser entre 0 i 10.");
                }
            } catch (Exception e) {
                System.out.println("Has d'introduir un valor numèric.");
                sc.next();
            }
        }
        return size;
    }

    public static float[] introduceValues(int size) {
        Scanner sc = new Scanner(System.in);
        float[] notes = new float[size];
        for (int i = 0; i < size; i++) {
            float value = checkValidValue();
            notes[i] = value;
        }
        return notes;
    }

    public static float checkValidValue() {
        Scanner sc = new Scanner(System.in);
        float value = 0;
        boolean valid = false;
        while (!valid) {
            System.out.print("Introdueix una nota (entre 0 i 10): ");
            try {
                value = sc.nextFloat();
                if (value >= 0 && value <= 10) {
                    valid = true;
                } else {
                    System.out.println("El valor ha de ser entre 0 i 10.");
                }
            } catch (Exception e) {
                System.out.println("Has d'introduir un valor numèric.");
                sc.next();
            }
        }
        return value;
    }

    public static float calculateAverage(float[] notes) {
        float sum = 0;
        for (float note : notes) {
            sum += note;
        }
        return sum / notes.length;
    }

    public static void checkPass(float average) {
        if (average >= 5) {
            System.out.println("Aprovat!");
        } else {
            System.out.println("Suspès!");
        }
    }
}
