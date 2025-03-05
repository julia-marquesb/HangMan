import java.util.Scanner;


 ////initialized variable Scanner and uses the contructor that calls the instance is created
public class PlayerInput {
private Scanner scanner;
 
     public PlayerInput() {
         this.scanner = new Scanner(System.in);
     }
 
     //this method will be used to get a letter guessed by the player.  
     //Checks if the input is not a single character or not a letter. If so, throws an IllegalArgumentException with a message.
     //the while loop will keep going until the user enter a valid input
     public char getUserInput() {
         while (true) {
             try {
                 System.out.print("Enter a letter: ");
                 String input = scanner.next();

                 if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                     throw new IllegalArgumentException("Invalid input. Please enter a single letter.");
                 }
 
                 //If the input is valid, returns the first character of the input string
                 return input.charAt(0);
             } catch (IllegalArgumentException e) {
                 System.out.println(e.getMessage());
             }
         }
     }
 }




