package JAVA;

import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
	public static int romanToInt(String s) {
		// Create a HashMap to store the values of Roman numerals.
		HashMap<Character, Integer> romanValues = new HashMap<>();
		romanValues.put('I', 1);
		romanValues.put('V', 5);
		romanValues.put('X', 10);
		romanValues.put('L', 50);
		romanValues.put('C', 100);
		romanValues.put('D', 500);
		romanValues.put('M', 1000);

		int result = 0;
		int prevValue = 0;

		for (int i = s.length() - 1; i >= 0; i--) {
			int curValue = romanValues.get(s.charAt(i));

			// If the current value is less than the previous value, subtract it
			if (curValue < prevValue) {
				result -= curValue;
			} else {
				result += curValue;
			}

			prevValue = curValue;
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any roman number: ");
		String input = scanner.nextLine().toUpperCase();
		// try your own different Roman numerals
		int result = romanToInt(input);
		System.out.println("Integer value of " +input +" is:  " +result);
	}

}

