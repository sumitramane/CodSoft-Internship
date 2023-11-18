import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int RandomNumber = random.nextInt(100) + 1;
        int attempts = 0;
        boolean GuessedCorrectly = false;

        System.out.print("Enter your name: ");
        String Name = sc.nextLine();

        System.out.println("Hey " + Name + "! Welcome to Number guessing game!");

        System.out.println("Guess the number between 1-100:");

        while (!GuessedCorrectly) {
            System.out.print("\nGuess your number: ");
            int UserNumGuess = sc.nextInt();
            attempts++;

            if (UserNumGuess == RandomNumber) {
                GuessedCorrectly = true;
                System.out.println(
                        "Congratulations!" + Name + "You have guessed correct number in" + attempts + "attempts");
            } else if (UserNumGuess < RandomNumber) {
                System.out.println("You are not close to the number! Try again");
            } else {
                System.out.println("You are too close! Try again");

            }
            sc.close();
        }
    }
}
