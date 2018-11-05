import java.util.*;
public class crackTheCode {
	public static void main(String[] args) {
		Scanner run = new Scanner(System.in);
		int[] input = new int[3]; // array stores user's inputs
		String[] phases = {"\nPHASE 1", "\nPHASE 2", "\nPHASE 3"}; // array stores strings/phases throughout the program
		String incorrect = "Sorry, that was incorrect!" + "\nBetter luck next time!";
		String correct = "Correct!";
		System.out.println("Welcome. What is your name?");
		String name = run.nextLine();
		System.out.println("Hello " + name + ". Try your best to crack the code!");
		for(int i = 0; i < input.length; i++) {
			System.out.println(phases[i]);
			System.out.println("Enter a number:");
			input[i] = run.nextInt();
			if(i == 0) { 
				if(input[0] == 3)
					System.out.println(correct);
				else {
					System.out.println(incorrect);
					break;
				}
			}
			if(i == 1) {
				if (input[1] == 1 || (input[1] >= 33 && input[1] <= 100)) 
						System.out.println(correct);
				else {
					System.out.println(incorrect);
					break;
				}
			}
			if (i == 2) {
				if(input[2] > 0 && (input[2] % 3 == 0 || input[2] % 7 == 0)) 
					System.out.print(correct + "\nYou have cracked the code!");
				else {
					System.out.println(incorrect);
					break; 
				} 
			} 
		}
	}
}
