
// imports the entire util package, including both the Scanner and ArrayList class
import java.util.ArrayList;
import java.util.Scanner;

public class AlienMessageBoard { // class header
	public static void main(String[] args) { // method body
		Scanner run = new Scanner(System.in);
		String searchCarrot = "^^", searchQ = "qey",
				searchCash = "$"; /* declares and initializes all swear search words */
		int occurrencesCarrot = 0, occurrencesQ = 0,
				occurrencesCash = 0; /* declares a counting variable for the occurrences of the swear words */
		char newline = '\n'; // escape sequence for a newline
		boolean flagged = false; // checks to see if the post is flagged.
		char searchSpace = ' '; // char that stores a space (literally)

		ArrayList<Integer> spaces = new ArrayList<Integer>(); /*
																 * ArrayList to store the indexes of the spaces in the
																 * post. ArrayList because you can add elements and
																 * don't know how many positions the array will require
																 */
		ArrayList<String> words = new ArrayList<String>(); // same as above; stores all the words in the post

		System.out.println("Enter message board post: " + newline);
		String user = run.nextLine();
		String username = user.substring(0,
				(user.indexOf(" -"))); /* finds the user name from the first index to the first occurrence of a dash */
		int dash = user.indexOf("-"); // index of dash
		String post = user.toLowerCase() + " "; /*
												 * accessor method makes the user String into lower case to account for
												 * all the possible conditions and formatting of swear words
												 */

		// search for spaces
		for (int i = dash; i < post.length(); i++) { /*
														 * searches the entirety of the post String. i is equal to the
														 * value of dash because the dash will serve as a starting point
														 * for searching for the rest of the spaces and words
														 */
			if (post.charAt(i) == searchSpace) { // extracts char at a time and checks to see if the character is a
													// space
				spaces.add(i); // if the character is a space, record its index in the spaces ArrayList
			}
		}

		// store words in array
		for (int i = 0; i < spaces.size() - 1; i++) { /*
														 * since you are looking one index ahead, only loop until less
														 * than size()-1 because anything higher than that will result
														 * in an IndexOutOfBounds Exception
														 */
			words.add(post.substring(spaces.get(i) + 1,
					spaces.get(i + 1))); /*
											 * add the substring between the first index of a space and the index of the
											 * second space, etc., to the words ArrayList
											 */
		}

		for (int i = 0; i < words.size(); i++) { // searching through the length of the words array

			// search for ^^
			if (words.get(i).equals(searchCarrot)) { /*
														 * if the word equals to the swear word, increment the
														 * occurrences of the word and flag it
														 */
				occurrencesCarrot++;
				flagged = true;
			}

			// search for qey
			if (words.get(i).equals(searchQ)) {
				occurrencesQ++;
				flagged = true;
			}

			// search for $
			if (words.get(i).equals(searchCash)) {
				occurrencesCash++;
				flagged = true;
			}
		}

		if (flagged) // if flagged condition true, execute the following block:
			System.out.println(newline + "Results: " + newline + newline + "BAD" + newline + username + newline + "^^: "
					+ occurrencesCarrot + newline + "qey: " + occurrencesQ + newline + "$: " + occurrencesCash);

		else
			System.out.println("CLEAN");

	}
}