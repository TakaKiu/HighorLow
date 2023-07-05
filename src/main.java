import java.util.Random;
import java.util.Scanner;

class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(10) + 1;

        int guess;
        boolean isCorrectGuess = false;

        do {

            System.out.print("Guess the number (between 1 and 10): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid number: ");
                scanner.next();
            }
            guess = scanner.nextInt();

            if (guess == randomNumber) {
                isCorrectGuess = true;
            } else if (guess < randomNumber) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
        } while (!isCorrectGuess);

        System.out.println("The number was: " + randomNumber);
        System.out.println("On the money!");
    }
}


