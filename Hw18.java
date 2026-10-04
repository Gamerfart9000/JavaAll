package homewrk;

import java.util.*;

public class Hw18 {

	public static void bubbleSort(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					// Swap
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	// Function to merge two sorted arrays
	public static int[] merge(int[] arr1, int[] arr2) {
		int[] result = new int[arr1.length + arr2.length];

		int i = 0;
		int j = 0;
		int k = 0;

		// Compare elements from both arrays
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				result[k] = arr1[i];
				i++;
			} else {
				result[k] = arr2[j];
				j++;
			}

			k++;
		}

		// Add remaining elements of arr1
		while (i < arr1.length) {
			result[k] = arr1[i];
			i++;
			k++;
		}

		// Add remaining elements of arr2
		while (j < arr2.length) {
			result[k] = arr2[j];
			j++;
			k++;
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input first array
		System.out.print("Enter size of first array: ");
		int n1 = sc.nextInt();

		int[] arr1 = new int[n1];

		System.out.println("Enter elements of first array:");
		for (int i = 0; i < n1; i++) {
			arr1[i] = sc.nextInt();
		}

		// Input second array
		System.out.print("Enter size of second array: ");
		int n2 = sc.nextInt();

		int[] arr2 = new int[n2];

		System.out.println("Enter elements of second array:");
		for (int i = 0; i < n2; i++) {
			arr2[i] = sc.nextInt();
		}

		// Sort both arrays using Bubble Sort
		bubbleSort(arr1);
		bubbleSort(arr2);

		// Merge the two sorted arrays
		int[] result = merge(arr1, arr2);

		// Print sorted arrays
		System.out.println("Sorted first array:");
		for (int x : arr1) {
			System.out.print(x + " ");
		}

		System.out.println();

		System.out.println("Sorted second array:");
		for (int x : arr2) {
			System.out.print(x + " ");
		}

		System.out.println();

		// Print final merged array
		System.out.println("Merged sorted array:");
		for (int x : result) {
			System.out.print(x + " ");
		}
	 sc.close();
	}
}
