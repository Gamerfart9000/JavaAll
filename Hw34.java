package homewrk;

import java.util.*;

public class Hw34 {

	static void find(int[] arr, int target, int i, ArrayList<Integer> list) {
		if (target == 0) {
			System.out.println(list);
			return;
		}

		if (i == arr.length || target < 0) {
			return;
		}

		list.add(arr[i]);
		find(arr, target - arr[i], i, list);

		list.remove(list.size() - 1);
		find(arr, target, i + 1, list);
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 6, 7 };
		find(arr, 7, 0, new ArrayList<Integer>());
	}
}
