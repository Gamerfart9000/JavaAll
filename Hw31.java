package homewrk;

public class Hw31 {
	public static int findSecondLargest(int[] arr) {
	    if (arr.length < 2) {
	        return -1;
	    }

	    int largest = arr[0];
	    int second = -1;

	    for (int i = 1; i < arr.length; i++) {
	        if (arr[i] > largest) {
	            second = largest;
	            largest = arr[i];
	        } else if (arr[i] > second && arr[i] < largest) {
	            second = arr[i];
	        }
	    }

	    return second;
	}

}
