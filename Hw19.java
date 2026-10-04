package homewrk;

import java.util.*;

public class Hw19 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] A = new int[n];
		int[] sorted = new int[n];

		// Read the array
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
			sorted[i] = A[i];
		}

		// Selection Sort
		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;

			// Find the smallest element
			// in the unsorted part
			for (int j = i + 1; j < n; j++) {
				if (sorted[j] < sorted[minIndex]) {
					minIndex = j;
				}
			}

			// Swap
			int temp = sorted[i];
			sorted[i] = sorted[minIndex];
			sorted[minIndex] = temp;
		}

		// Find the position of each original element
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (A[i] == sorted[j]) {
					// +1 because positions start from 1
					System.out.print((j + 1) + " ");
					break;
				}
			}
		}
		sc.close();
	}
}
