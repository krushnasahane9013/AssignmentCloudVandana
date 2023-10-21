package JAVA;

import java.util.HashSet;
import java.util.Scanner;

public class PangramChecking{
	public static void main(String[] args) {
		//scanner to take input from user
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String input = scanner.nextLine().toLowerCase();
		boolean isPangram = checkPangram(input);
		//check whether string is pangram or not
		if (isPangram) {
			System.out.println("The input is a pangram.");
		} else {
			System.out.println("The input is not a pangram.");
		}
	}

	public static boolean checkPangram(String input) {
		HashSet<Character> alphabetSet = new HashSet<>();
		//use for loop to check alphabet
		for (char c = 'a'; c <= 'z'; c++) {
			alphabetSet.add(c);
		}

		for (char c : input.toCharArray()) {
			if (c >= 'a' && c <= 'z') {
				alphabetSet.remove(c);
			}
		}

		return alphabetSet.isEmpty();
	}
}

