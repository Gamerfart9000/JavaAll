package homewrk;

import java.util.*;

public class Hw24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = sc.nextLine();

		// Convert the string to lowercase
		str = str.toLowerCase();

		boolean pangram = true;

		// Check all 26 letters
		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (str.indexOf(ch) == -1) {
				pangram = false;
				break;
			}
		}

		if (pangram) {
			System.out.println("The string is a Pangram.");
		} else {
			System.out.println("The string is not a Pangram.");
		}
	}
}
