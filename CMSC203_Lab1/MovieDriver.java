import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String response;
		do {
		Movie m = new Movie();
		System.out.println("Enter the title of the movie: ");
		String movieTitle;
		movieTitle = scan.nextLine();
		m.setTitle(movieTitle);
		System.out.println("Enter the rating of the movie: ");
		String movieRating;
		movieRating = scan.nextLine();
		m.setRating(movieRating);
		System.out.println("Enter the number of tickets sold for this movie: ");
		int ticketsSold;
		ticketsSold = scan.nextInt();
		m.setSoldTickets(ticketsSold);
		System.out.println(m);
		scan.nextLine();
		System.out.println("Do you want to enter another? (y or n)");
		response = scan.nextLine();
		}while(response.equalsIgnoreCase("y"));
		if (response.equalsIgnoreCase("n"))
			System.out.println("Goodbye");
	    scan.close(); // to close the scanner class object
		System.exit(0);
		
		
	}

}
