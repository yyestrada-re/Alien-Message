import java.util.*;
public class Lesson_20_Activity {
	public static void main(String[] args) {
		Scanner run = new Scanner(System.in);
		double north = 0, south = 0, east = 0, west = 0, checkLat = 0, checkLong = 0, farN = 0, farS = 0, farE = 0, farW = 0;
		int again = 1; //the loop may run again
		boolean incorrect = false;
		while(again == 1) {
			System.out.println("Please enter the latitude: ");
			checkLat = run.nextDouble(); // this is the variable that checks to see if the user input meets the conditions for latitude
			if(!(checkLat < -90 || checkLat > 90)) { // Checks to see if latitude meets its restrictions: latitude must not be between -90 and 90 inclusive 
				if(checkLat > farS) {	// a positive number for latitude implies north		(used to be 0)	  
					north = checkLat; // identifies latitude as north
					if(north > farN) // checks to see if the current value for north is greater than the previous.
						farN = north; // if the current value of north is greater than the previous greatest value for north, farN gets updated.
				} // closing curly bracket for the north latitude condition
				else if(checkLat < north) { // opening curly bracket for the south latitude condition
					south = checkLat; // identifies latitude as south if the conditions for north are not met (latitude is negative)
					if(south < farS) 
						farS = south; // logical assumption to make is that if the current value for south is greater than its previous value, farS should be updated.
				} // closing curly bracket for the south latitude condition
			} // closes embedded if statement for latitude
			System.out.println("Please enter the longitude: "); // marks the start of the conditions for the longitude
			checkLong = run.nextDouble(); // assigns user input to another variable to check to see if it meets the conditions for longitude
			if(!(checkLong < -180 || checkLong > 180)) { // checks to see if longitude is between -180 and 180 inclusive 
				if(checkLong > 0) { //a positive number for longitude implies east
					east = checkLong;
					if(east > farE) 
						farE = east;
				} // closing curly bracket for the east latitude condition
				if(checkLat > farE) {
					west = checkLat; // if it doesn't meet the conditions for east, longitude is west
					if(west > farW) 
						farW = west;
				} // closing curly bracket for the west latitude condition
			} // closes embedded if statement for longitude
			if(!((checkLat <= 90 && checkLat >= -90) && (checkLong >= -180 && checkLong <= 180))) { /* user input does not meet parameters. more efficient to 
															print the statement after the loop is over & lat/long are accounted for */
				System.out.println("Incorrect Latitude or longitude");
				continue;
			}
			System.out.println("Would you like to enter another location? ");
			again = run.nextInt(); // in this case, the user input acts as the flag variable and stops the loop.
		} // closing curly bracket for the while loop
		System.out.println("Farthest North: " + farN);
		System.out.println("Farthest South: " + farS);
		System.out.println("Farthest East: " + farE);
		System.out.println("Farthest West: " + farW);
	} // closes method body
} // closing class header