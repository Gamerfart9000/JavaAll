package homewrk;


public class Hw6 {
	public static long maxSubarraySum(int[] A, long K) {
	    int N = A.length;

	    long total = 0;
	    long maxSubarray = Long.MIN_VALUE;

	    // Kadane's algorithm
	    long current = 0;

	    for (int x : A) {
	        current = Math.max((long) x, current + x);
	        maxSubarray = Math.max(maxSubarray, current);
	        total += x;
	    }

	    // Only one copy
	    if (K == 1) {
	        return maxSubarray;
	    }

	    // Maximum prefix sum
	    long prefix = Long.MIN_VALUE;
	    long sum = 0;

	    for (int x : A) {
	        sum += x;
	        prefix = Math.max(prefix, sum);
	    }

	    // Maximum suffix sum
	    long suffix = Long.MIN_VALUE;
	    sum = 0;

	    for (int i = N - 1; i >= 0; i--) {
	        sum += A[i];
	        suffix = Math.max(suffix, sum);
	    }

	    // A subarray can cross from one copy to another
	    long answer = Math.max(maxSubarray, prefix + suffix);

	    // If total sum is positive, include the middle copies
	    if (total > 0) {
	        answer = Math.max(
	            answer,
	            prefix + suffix + (K - 2) * total
	        );
	    }

	    return answer;
	}


}
