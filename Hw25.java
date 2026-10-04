package homewrk;

import java.util.*;

public class Hw25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter email ID: ");
		String email = sc.nextLine();

		int numeric = 0;
		int special = 0;

		for (int i = 0; i < email.length(); i++) {
			char ch = email.charAt(i);

			if (ch >= '0' && ch <= '9') {
				numeric++;
			} else if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))) {
				special++;
			}
		}

		System.out.println("Frequency of numeric characters: " + numeric);
		System.out.println("Frequency of special characters: " + special);
	}
}
