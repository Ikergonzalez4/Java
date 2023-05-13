package Ex_java.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\ikerg\\IdeaProjects\\GithubJava\\UF3 File management\\Exercices\\numbers.txt");
        try {
            Scanner scanner = new Scanner(file);
            double sum = 0;
            int count = 0;
            while (scanner.hasNextDouble()) {
                double number = scanner.nextDouble();
                sum += number;
                count++;
                System.out.print(number + " ");
            }
            scanner.close();
            double average = sum / count;
            System.out.println("\nValor medio: " + average);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
