package homewrk;

import java.util.*;

public class Hw14 {

	// Recursive solution
	public static int maxRecursive(int[] arr, int index) {
		if (index == arr.length - 1) {
			return arr[index];
		}

		return Math.max(arr[index], maxRecursive(arr, index + 1));
	}

	// Iterative solution
	public static int maxIterative(int[] arr) {
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Maximum (Recursive): " + maxRecursive(arr, 0));
		System.out.println("Maximum (Iterative): " + maxIterative(arr));
		sc.close();
	}

}
