package homewrk;

import java.util.*;

public class Hw16 {
	public static void printTargetSumSubsets(int[] arr, int idx, String set, int sum, int tar) {

		if (idx == arr.length) {
			if (sum == tar) {
				System.out.println(set + ".");
			}
			return;
		}

		// Include the current element
		printTargetSumSubsets(arr, idx + 1, set + arr[idx] + ", ", sum + arr[idx], tar);

		// Don't include the current element
		printTargetSumSubsets(arr, idx + 1, set, sum, tar);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int tar = sc.nextInt();

		printTargetSumSubsets(arr, 0, "", 0, tar);
		sc.close();
	}

}
