package homewrk;


public class Hw13 {

	// Recursive function to solve Tower of Hanoi
	public static void towerOfHanoi(int n, int source, int destination, int auxiliary) {

		// Base case: move one disk directly
		if (n == 1) {
			System.out.println("Move disk 1 from Tower " + source + " to Tower " + destination);
			return;
		}

		// Move n-1 disks from source to auxiliary
		towerOfHanoi(n - 1, source, auxiliary, destination);

		// Move the largest disk from source to destination
		System.out.println("Move disk " + n + " from Tower " + source + " to Tower " + destination);

		// Move n-1 disks from auxiliary to destination
		towerOfHanoi(n - 1, auxiliary, destination, source);
	}

	public static void main(String[] args) {

		int n = 6;

		// Tower 1 -> Tower 2 using Tower 3
		towerOfHanoi(n, 1, 2, 3);
	}
}
