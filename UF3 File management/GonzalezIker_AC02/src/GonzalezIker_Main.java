import models.GonzalezIker_Character;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GonzalezIker_Main {

    static ArrayList<GonzalezIker_Character> characterList = new ArrayList<>();

    public static void main(String[] args) {
        showMenu();
        try {
            File file = new File("characters-one-piece-2.csv");
            Scanner scanner = new Scanner(file);
            scanner.nextLine();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(",");
                String name = data[0];
                int bounty = Integer.parseInt(data[1]);
                String devilFruit = data[2];
                String occupation = data[3];
                GonzalezIker_Character character = new GonzalezIker_Character(name, bounty, devilFruit, occupation);
                characterList.add(character);
            }
            scanner.close();
            showMenu();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("Enter an option:");
            System.out.println("1. Show all characters");
            System.out.println("2. Add a character");
            System.out.println("3. Edit a character");
            System.out.println("4. Delete a character");
            System.out.println("5. Exit");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    printCharacterList();
                    break;
                case 2:
                    addCharacter();
                    break;
                case 3:
                    editCharacter();
                    break;
                case 4:
                    deleteCharacter();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
        scanner.close();
    }

    private static void deleteCharacter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter character name to delete:");
        String name = scanner.nextLine();
        boolean found = false;
        for (GonzalezIker_Character character : characterList) {
            if (character.getName().equals(name)) {
                characterList.remove(character);
                System.out.println("Character deleted: " + character);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Character not found");
        }
    }

    public static void printCharacterList() {
        for (GonzalezIker_Character character : characterList) {
            System.out.println(character);
        }
    }

    public static void addCharacter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter character name:");
        String name = scanner.nextLine();
        System.out.println("Enter bounty:");
        int bounty = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter devil fruit:");
        String devilFruit = scanner.nextLine();
        System.out.println("Enter occupation:");
        String occupation = scanner.nextLine();
        GonzalezIker_Character character = new GonzalezIker_Character(name, bounty, devilFruit, occupation);
        characterList.add(character);
        System.out.println("Character added: " + character);
    }

    public static void editCharacter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter character name to edit:");
        String name = scanner.nextLine();
        boolean found = false;
        for (GonzalezIker_Character character : characterList) {
            if (character.getName().equals(name)) {
                System.out.println("Enter new bounty (current: " + character.getBounty() + "):");
                int bounty = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter new devil fruit (current: " + character.getDevilFruit() + "):");
                String devil = scanner.nextLine();
                System.out.println("Enter new occupation (current: " + character.getOccupation() + "):");
                String occupation = scanner.nextLine();
                character.setBounty(bounty);
                character.setDevilFruit(devil);
                character.setOccupation(occupation);
                System.out.println("Character edited: " + character);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Character not found");
        }
    }
}
