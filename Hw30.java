package homewrk;
import java.util.Arrays;
public class Hw30 {
	

	public static double findMedian(int[] arr) {
	    Arrays.sort(arr);

	    int n = arr.length;

	    if (n % 2 == 1) {
	        // Odd length: return the middle element
	        return arr[n / 2];
	    } else {
	        // Even length: average the two middle elements
	        return ((double) arr[n / 2 - 1] + arr[n / 2]) / 2;
	    }
	}

}
