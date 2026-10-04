package homewrk;

import java.util.*;

public class Hw12 {
	class Solution {
		public String getPermutation(int n, int k) {
			List<Integer> nums = new ArrayList<>();

			for (int i = 1; i <= n; i++) {
				nums.add(i);
			}

			// Calculate (n - 1)!
			int factorial = 1;
			for (int i = 1; i < n; i++) {
				factorial *= i;
			}

			// Convert k to 0-based indexing
			k--;

			StringBuilder result = new StringBuilder();

			for (int remaining = n; remaining >= 1; remaining--) {

				// Find which block k belongs to
				int index = k / factorial;

				result.append(nums.get(index));
				nums.remove(index);

				// Position within the selected block
				k %= factorial;

				// Calculate (remaining - 1)!
				if (remaining > 1) {
					factorial /= (remaining - 1);
				}
			}

			return result.toString();
		}
	}

}
