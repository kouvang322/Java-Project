package com.javaeasily.demos;
import java.util.Scanner;

public class MyApp {

	public static void main(String[] args) {
		int min = 1;
		int max = 1000;
		int randomNumber = (int)Math.floor(Math.random()*(max-min+1)+min);
		System.out.println(randomNumber);
		int userGuess;
		
		System.out.println("Guess number here: ");
		
		
		Scanner scanner = new Scanner(System.in);
		
		//String whateverUserTypedIn = scanner.nextLine();
		
		do {
	    userGuess = scanner.nextInt();
	    if (userGuess == randomNumber)
	        System.out.println("Congratz! you guessed correctly.");
	    else if (userGuess < 1 || userGuess > 1000)
	        System.out.println("Your guess must be between 1 and 1000");
	    else if (userGuess < randomNumber)
	    	System.out.println("Your guess is too low");
	    else if (userGuess > randomNumber)
	    	System.out.println("Your guess is too high");
	} while (userGuess != randomNumber);
		
		
		//outputOfWhatUserTyped(whateverUserTypedIn);
		
		scanner.close();
	}

	/*private static void outputOfWhatUserTyped(String num) {
		
		
 		System.out.println("Number is  " + num);
	}*/
	
	
}

//if (whateverUserTypedIn < randomNumber) {
//	  System.out.println("Guess is too low");}


/*do {
    System.out.print("(your guess): ");
    userGuess = scanner.nextInt();
    if (userGuess == randomNumber)
        System.out.println("Wow! you guessed it");
    else if (userGuess < 1 || userGuess > 1000)
        System.out.println("Your guess must be between 1 and 1000");
} while (userGuess != randomNumber);*/



