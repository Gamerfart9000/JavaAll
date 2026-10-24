package homewrk;

public class Hw29 {
	public static int columnWithMinZeros(int[][] arr) {
	    int minZeros = Integer.MAX_VALUE;
	    int minColumn = 0;

	    for (int col = 0; col < arr[0].length; col++) {
	        int zeros = 0;

	        for (int row = 0; row < arr.length; row++) {
	            if (arr[row][col] == 0) {
	                zeros++;
	            }
	        }

	        if (zeros < minZeros) {
	            minZeros = zeros;
	            minColumn = col;
	        }
	    }

	    return minColumn;
	}

}
