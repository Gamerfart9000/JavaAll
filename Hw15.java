package homewrk;

import java.util.*;

public class Hw15 {

	public static int climbStairs(int n) {

		// If exactly 0 stairs are left
		if (n == 0) {
			return 1;
		}

		// If we go below 0, it is not a valid way
		if (n < 0) {
			return 0;
		}

		// Take 1, 2, or 3 steps
		return climbStairs(n - 1) + climbStairs(n - 2) + climbStairs(n - 3);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		System.out.println(climbStairs(n));
	    sc.close();
	}   
}
