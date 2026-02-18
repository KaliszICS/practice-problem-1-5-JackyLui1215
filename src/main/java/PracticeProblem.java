/**
	* File: Lesson 1.5: Characters
	* Author: Jacky Lui
	* Date Last Modified: February 18, 2026
	*/

	import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
	}

	public static void q1() {
		//Write question 1 code here
		char character = 'a';
		System.out.println(character);
	}

	public static void q2() {
		//Write question 2 code here
		Scanner input = new Scanner(System.in);
		String word;
		System.out.print("Input a word: ");
		word = input.nextLine();
		char char3 =word.charAt(2);
		System.out.println(char3);
	}

	public static void q3() {
		//Write question 3 code here
		Scanner input = new Scanner(System.in);
		String word;
		System.out.print("Input a word: ");
		word = input.nextLine();
		char char2 =word.charAt(1);
		System.out.println("The second character user entered was: " + char2);
	}

	public static void q4() {
		//Write question 4 code here
		Scanner input = new Scanner(System.in);
		int number;
		System.out.print("Input a number: ");
		number = input.nextInt();
		System.out.println("Your number plus 1 is: " + (number + 1));
	}

	public static void q5() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		String letter;
		System.out.print("Input a letter: ");
		letter = input.nextLine();
		char char1 = letter.charAt(0);
		char letter1 = char1;

		String letter2;
		System.out.print("Input another letter: ");
		letter2 = input.nextLine();
		char char2 = letter2.charAt(0);
		char letter3 = char2;

		System.out.println(char1 + char2);



	}

}
