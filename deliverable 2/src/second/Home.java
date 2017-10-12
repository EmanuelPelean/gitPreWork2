package second;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Home {
	
	// Initialize Integer variables. 
	static int month1 = 0;
	static int month2 = 0;
	static int year1 = 0;
	static int year2 = 0;
	static int day1 = 0;
	static int day2 = 0;
	
	public static void main(String[] args) {
		
		calculateTime(); // Use method to obtain input and perform calculations.
		
	}
		
	// Method to calculate duration.
	public static void calculateTime() {
		
		Scanner scnr = new Scanner(System.in);
		
		// Prompt for first date.
		System.out.println("Please enter the first date using the following format (Example: 03 15 1990); ");
		
		// Store variables
		month1 = scnr.nextInt();
		day1 = scnr.nextInt();
		year1 = scnr.nextInt();
		
		// Prompt for second date.
		System.out.println("Please enter the second date using the following format (Example: 03 15 1990); ");
		
		// Store variables
		month2 = scnr.nextInt();
		day2 = scnr.nextInt();
		year2 = scnr.nextInt();
		
		// Transfer initial variables to instances of LocalDate class.
		LocalDate firstDate = LocalDate.of(year1, month1, day1);
		LocalDate secondDate = LocalDate.of(year2, month2, day2);
		
		// Use the ChronoUnit class to calculate time difference.
		long diffInDays = Math.abs(ChronoUnit.DAYS.between(firstDate, secondDate));
	    long diffInMonths = Math.abs(ChronoUnit.MONTHS.between(firstDate, secondDate));
	    long diffInYears = Math.abs(ChronoUnit.YEARS.between(firstDate, secondDate));
	     
	    // Print results.
	    System.out.println("The duration between the two dates is " + diffInDays + " days, " + diffInMonths + " months, and "
	     		+ diffInYears + " years.");
	     
	    // Close scanner 
	    scnr.close();
		
	}
	
}

	
	


