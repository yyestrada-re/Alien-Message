//Write a program that will input a list of test scores in from the keyboard. When the user enters -1, print the average.
import java.util.*;
public class Lesson_17_Activity_One {

	public static void main(String[] args) {
		int scores = 0;
		int iterations = 0;
		int sum = 0;
		double average;
		Scanner kin = new Scanner(System.in);
		System.out.println("Enter the Scores:");
		while(scores != -1) {
			scores = kin.nextInt();
			iterations++;
			sum += scores;
			if(scores == -1) {
				iterations -= 1;
				sum += 1;
			}
		}
		System.out.println(sum + " " + iterations);
		average = sum * 1.0 / iterations * 1.0;
		System.out.println("The average is: " + average);
	}

}