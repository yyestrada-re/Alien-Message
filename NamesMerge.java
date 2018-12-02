import java.util.Arrays;
import java.util.Scanner;

public class NamesMerge {
	public static void main(String[] args) {
		Scanner run = new Scanner(System.in);
		int i = 0;
		int n = 0;
		int instances = 0;
		int secondInstances = 0;
		int mergedInstances = 0;
		int start = 0;
		char newline = '\n';
		boolean end = false;
		boolean first = true;
		boolean second = true;
		boolean ordered = true;
		String[] firstArray = new String[10000];
		String[] newArray;
		String[] secondNewArray;
		String[] secondArray = new String[10000];
		System.out.println("Enter the values for the first array, up to 10000 values, enter \'End\' to quit");
		while (first) {
			while (!end) {
				String name = (run.nextLine()).toLowerCase();
				name = ((name.substring(0, 1)).toUpperCase()) + name.substring(1, name.length());
				firstArray[i] = name;
				if (firstArray[i].equals("End")) {
					end = true;
					firstArray[i] = null;
				}
				i++;
			}
			first = false;
		}
		end = false; // resets values
		// searches for the amount of positions the user took up
		for (int x = 0; x < firstArray.length; x++) {
			if (firstArray[x] != null) {
				instances++;
			}
		}
		newArray = new String[instances];

		// stores the user's positions in a new array
		for (int x = 0; x < newArray.length; x++) {
			newArray[x] = firstArray[x]; // assigns new values
		}

		// checks to see if the array is ordered correctly
		for (int x = 0; x < newArray.length - 1; x++) {
			if (newArray[x].compareTo(newArray[x + 1]) > 0) {
				ordered = false;
			}
			if (newArray[x].compareTo(newArray[newArray.length - 1]) > 0) {
				ordered = false;
			}
		}

		// beginning of second loop
		System.out.println(newline + "Enter the values for the first array, up to 10000 values, enter \'End\' to quit");
		while (second) {
			while (!end) {
				String name = (run.nextLine()).toLowerCase();
				name = ((name.substring(0, 1)).toUpperCase()) + name.substring(1, name.length());
				secondArray[n] = name;
				if (secondArray[n].equals("End")) {
					end = true;
					secondArray[n] = null;
				}
				n++;
			}
			second = false;
		}
		for (int x = 0; x < secondArray.length; x++) {
			if (secondArray[x] != null) {
				secondInstances++;
			}
		}
		secondNewArray = new String[secondInstances];

		// stores the user's positions in a new array
		for (int x = 0; x < secondNewArray.length; x++) {
			secondNewArray[x] = secondArray[x]; // assigns new values
		}

		// checks to see if the array is ordered correctly
		for (int x = 0; x < secondNewArray.length - 1; x++) {
			if (secondNewArray[x].compareTo(secondNewArray[x + 1]) > 0) {
				ordered = false;
			}
			if (secondNewArray[x].compareTo(secondNewArray[secondNewArray.length - 1]) > 0) {
				ordered = false;
			}
		}

		// prints first array
		System.out.println(newline + "First Array");
		for (int x = 0; x < newArray.length; x++) {
			System.out.print(newArray[x] + " ");
		}
		System.out.println();

		// prints out second array
		System.out.println(newline + "Second Array");
		for (int x = 0; x < secondNewArray.length; x++) {
			System.out.print(secondNewArray[x] + " ");
		}
		System.out.println();

		if (!ordered) {
			System.out.println(newline + "Error: Arrays not in correct order");
		} else { // fix code here
			String[] mergedArray = new String[newArray.length + secondNewArray.length]; // be careful w/this
			for (int x = 0; x < mergedArray.length; x++) {
				for (x = 0; x < newArray.length; x++) {
					mergedArray[x] = newArray[x];
					// System.out.println("New Array Assigned values: " + mergedArray[x]); //
					// functional
				}
				for (x = newArray.length; x < mergedArray.length; x++) {
					mergedArray[x] = secondNewArray[start];
					start++;
					// System.out.println("Second New Array Assigned values: " + mergedArray[x]);
				}
			}
			Arrays.sort(mergedArray);
			System.out.println(newline + "Merged Array");
			for (int x = 0; x < mergedArray.length; x++) {
				System.out.print(mergedArray[x] + " ");
			}
		}

	}
}
