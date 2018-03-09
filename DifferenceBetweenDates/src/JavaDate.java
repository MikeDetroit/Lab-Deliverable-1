
// API's  for date and time period
import java.time.LocalDate;
import java.time.Period;

// To capture user entry
import java.util.Scanner;

public class JavaDate {
	static String oldestDateString = null;
	static String newestDateString = null;

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		boolean isvalid = false;

		// Prompts user entry.
		while (!isvalid) {
			System.out.println(
					"Enter two dates. Oldest first, then newest date. Enter format YYYY-MM-DD. Then enter after each: ");
			oldestDateString = scnr.next(); // Captures first entry
			newestDateString = scnr.next(); // Captures second entry

			if (oldestDateString.matches("[0-9]{4}-[0-9]{2}-[0-9]{2}")
					&& newestDateString.matches("[0-9]{4}-[0-9]{2}-[0-9]{2}")) {
				isvalid = true;
				
				// Uses localDate formatter for time.
				LocalDate newestDate = LocalDate.parse(newestDateString);
				LocalDate oldestDate = LocalDate.parse(oldestDateString);
				
				// Validates user input for dates.
				System.out.println("You entered " + oldestDateString + " for oldest date.");
				System.out.println("You entered " + newestDateString + " for newest date.");
				
				// Calculates difference between dates.
				Period difference = newestDate.until(oldestDate);
				int days = difference.getDays();
				int months = difference.getMonths();
				int years = difference.getYears();
				scnr.close();
				
				// Loop to print either calculated date function or ask for proper date input
				System.out.println(" Time passed is: " + years + " Years " + days + " Days " + months + " Months");
			} else {
				System.out.println("Please enter correct date format YYYY-MM-DD.");
			}
		}
	}
}
