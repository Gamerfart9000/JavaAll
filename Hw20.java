package homewrk;

import java.util.*;

public class Hw20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] A = new int[n];
		int[] sorted = new int[n];

		// Input
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
			sorted[i] = A[i];
		}

		// Insertion Sort
		for (int i = 1; i < n; i++) {
			int key = sorted[i];
			int j = i - 1;

			while (j >= 0 && sorted[j] > key) {
				sorted[j + 1] = sorted[j];
				j--;
			}

			sorted[j + 1] = key;
		}

		// Find the position of each element
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (A[i] == sorted[j]) {
					System.out.print((j + 1) + " ");
					break;
				}
			}
		}
	 sc.close();
	}

}
