package homewrk;

import java.util.*;

public class Hw23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Character> list = new ArrayList<>();

		System.out.print("Enter characters: ");
		String input = sc.nextLine();

		// Store each character in ArrayList
		for (int i = 0; i < input.length(); i++) {
			list.add(input.charAt(i));
		}

		// Construct the original string
		String str = "";

		for (int i = 0; i < list.size(); i++) {
			str += list.get(i);
		}

		System.out.println("Original string: " + str);

		// Find length
		int length = str.length();
		System.out.println("Length: " + length);

		// Find reverse
		String reverse = "";

		for (int i = length - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}

		System.out.println("Reverse: " + reverse);

		// Divide into two equal-length words
		if (length % 2 == 0) {
			int mid = length / 2;

			String word1 = str.substring(0, mid);
			String word2 = str.substring(mid);

			System.out.println("First word: " + word1);
			System.out.println("Second word: " + word2);
		} else {
			System.out.println("String cannot be divided into two equal-length words.");
		}
	}
}
