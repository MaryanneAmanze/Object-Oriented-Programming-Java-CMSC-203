import java.util.Scanner;
public class RandomNumberGuesser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Class: CMSC203 
		 * Instructor: Ahmed Tarek
		 * Description: This is an application that will receive a user’s guess and report if the number guessed is a random number that was generated.
		 * Due: 2/20/2023
		 * Platform/compiler:
		 * I pledge that I have completed the programming assignment independently.
		   I have not copied the code from a student or any source.
		   I have not given my code to any student.
		   Print your Name here: Maryanne Amanze
		*/
		Scanner scan = new Scanner(System.in);
		String response;
		do {
	
			int generatedNum = RNG.rand();
			int attempts = 0;
			int maxNum = 100;
			int minNum = 0;
			int guessedNum;
			System.out.println("Enter your first guess ");
			guessedNum = scan.nextInt(); // To take input from the user
			++attempts;
			//System.out.println("Number of guesses is " + attempts +"\n");
			//System.out.println(guessedNum);
			while(guessedNum < minNum || guessedNum > maxNum)
			{
				System.out.println("Guess must be between " + minNum + " and " + maxNum + ". Try again");
				guessedNum = scan.nextInt();
			}  
			while (guessedNum != generatedNum)
			{
				if (attempts == 7)
				{
					System.out.println ("You have exceeded the number of guesses");
					break;
				}
				System.out.println("Number of guesses is " + attempts);

				if (guessedNum > generatedNum)
				{
					System.out.println("your guess is too high");
					maxNum = guessedNum;
				}
				if(guessedNum < generatedNum)
				{
					System.out.println("your guess is too low");
					minNum = guessedNum;
				}
				
				System.out.println("Enter your next guess between " + minNum + " and " + maxNum);
				guessedNum = scan.nextInt();
				attempts++;
				while(guessedNum <= minNum || guessedNum >= maxNum) {
					RNG.inputValidation(guessedNum, minNum, maxNum);
					guessedNum = scan.nextInt();
				}
			}
			
			if (guessedNum == generatedNum)
			{
				System.out.println("Congratulations, you guessed correctly");

			}
			System.out.println();
			scan.nextLine();
			System.out.println("Try again? (yes or no)");
			response = scan.nextLine(); // To take input from the user
			
			}while (response.equalsIgnoreCase("yes"));
		if (response.equalsIgnoreCase("no"))
		  System.out.println("Thanks for playing...");
			
		
	
		
		
		
		
		
		
	    scan.close(); // to close the scanner class object
	    System.exit(0);

	}

}
