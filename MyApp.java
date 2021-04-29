
import java.util.Scanner;

public class MyApp {

	public static void main(String[] args) {
		// This is the method that boots up the entire program

		int min = 1;
		int max = 1000;
		int randomNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);
		System.out.println("The random number generated is: " + randomNumber);
		String userGuess;
		int tempVal = 0;

		// Printing another line to create some more
		System.out.println();
		System.out.println("Guess number here: ");

		// Instantiating the keyboard
		Scanner scanner = new Scanner(System.in);

		// Game starts here
		do {
			userGuess = scanner.nextLine();

			if (isStringInt(userGuess)) {
				int x = Integer.parseInt(userGuess);

				if (x == randomNumber) {
					tempVal = 1;
					System.out.println("Congratz! you guessed correctly.");
				} else if (x < 1 || x > 1000) {
					System.out.println("Your guess must be between 1 and 1000");
				} else if (x < randomNumber) {
					System.out.println("Your guess is too low");
				} else if (x > randomNumber) {
					System.out.println("Your guess is too high");
				}
			} else {
				System.out.println("DO NOT USE LETTERS!");
			}

		} while (tempVal == 0);

		scanner.close();

	}

	// This is a handy method to check to see if a String is an integer or not
	public static boolean isStringInt(String s) {
		// First we TRY to see if we can convert the String to an Integer
		try {
			Integer.parseInt(s);

			// if we can do the conversion, then we return a TRUE
			return true;

		} catch (NumberFormatException ex) {
			// if we CATCH an exception, what that means is that the conversion failed.
			// Then we return a false value
			return false;
		}
	}

}
