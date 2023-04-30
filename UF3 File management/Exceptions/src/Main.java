import java.util.*;

public class Main {
    private static int[] anArray;

    public static void main(String args[]) {
        Random rand = new Random();
        anArray = new int[rand.nextInt(20)]; //Get an array with a random length

        //Let's fill the array
        for (int j = 0; j < anArray.length; j++) {
            anArray[j] = rand.nextInt(100) ; //Get a random integer between 0 and 99
        }

        Scanner entry = new Scanner(System.in);
        boolean yn = true;
        while(yn){
            try{
                System.out.println("Here is our Integer Array:");
                System.out.println(Arrays.toString(anArray));
                System.out.print("Enter the index you want to display: ");
                int selection = entry.nextInt();
                System.out.println("Your selction:["+anArray[selection] +"]" );
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Error: Index out of bounds. Please enter a valid index.");
                continue; // Continue to next iteration of loop
            } catch (InputMismatchException e){
                System.out.println("Error: Input is not a valid integer. Please enter a valid integer.");
                entry.nextLine(); // Clear input buffer
                continue; // Continue to next iteration of loop
            } catch (NoSuchElementException e){
                System.out.println("Error: No line found. Please enter a valid integer.");
                entry.nextLine(); // Clear input buffer
                continue; // Continue to next iteration of loop
            } catch (IllegalStateException e){
                System.out.println("Error: Scanner is closed. Please restart the program.");
                break; // Exit loop
            }  finally {
                System.out.println("Finally block executed.");
            }

            System.out.println("Exit application?: yes or no");
            String decision = entry.next();
            switch(decision){
                case "yes":
                    yn = false;
                    break;
                case "no":
                    yn = true;
                    break;
                default :
                    System.out.println("please enter again ");
            }
        }
    }
}
