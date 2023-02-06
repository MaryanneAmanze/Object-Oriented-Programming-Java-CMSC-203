/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: This is a program that helps the user through some possible problems 
                to restore internet connectivity.
 * Due: 02/06/2023
 * Platform/compiler:
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Maryanne Amanze
*/

import java.util.Scanner;
public class WiFiDiagnosis 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("If you have a problem with connectivity, this wifi Diagnosis might work.");
		System.out.println("First step: reboot your computer");
		System.out.println("Are you able to connect with the internet? (yes or no)");
		String answer = scan.nextLine();
		if(answer.equalsIgnoreCase("yes"))
		{
			System.out.println("Rebooting your computer seemed to work ");
		}
		else if (answer.equalsIgnoreCase("no"))
		{
			System.out.println("Second step: reboot your router");
			System.out.println("Now are you able to connect with the internet (yes or no)");
			String answer2 = scan.nextLine();
		
			if(answer2.equalsIgnoreCase("yes"))
			{
				System.out.println("Rebooting your router seemed to work ");
			}
			else if (answer2.equalsIgnoreCase("no")) {
				System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power");
			    System.out.println("Now are you able to connect with the internet (yes or no)");
			    String answer3 = scan.nextLine();
			   if(answer3.equalsIgnoreCase("yes"))
				{
					System.out.println("Checking the router's cables seemed to work. ");
				}
				else if(answer3.equalsIgnoreCase("no"))
				{
					System.out.println("Fourth step: move your computer closer to your router. ");
				    System.out.println("Now are you able to connect with the internet (yes or no)");
				    String answer4 = scan.nextLine();
				    if(answer4.equalsIgnoreCase("yes"))
					{
						System.out.println("Moving your computer closer to your router seemed to work. ");
					}
					else {
						System.out.println("Fifth step: contact your ISP ");
					    System.out.println("Make sure your ISP is hooked to your router.");
					}
					    
				}
			    scan.close();
			    System.exit(0); 
	      

           }
		} 
    }
}
