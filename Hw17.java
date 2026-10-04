package homewrk;

import java.util.*;

public class Hw17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int x = sc.nextInt();

		int low = 0;
		int high = n - 1;

		int minimum = -1;
		int maximum = -1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (a[mid] == x) {
				// Exact denomination found
				minimum = a[mid];
				maximum = a[mid];
				break;
			} else if (a[mid] < x) {
				minimum = a[mid];
				low = mid + 1;
			} else {
				maximum = a[mid];
				high = mid - 1;
			}
		}

		System.out.println(maximum + " " + minimum);
	sc.close();
	}
}
