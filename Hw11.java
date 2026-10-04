package homewrk;

import java.util.*;

public class Hw11 {

	static void pzz(int n) {
		if (n == 1) {
			System.out.print("1 1 1 ");
			return;
		}

		System.out.print(n + " ");
		pzz(n - 1);

		System.out.print(n + " ");
		pzz(n - 1);

		System.out.print(n + " ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		pzz(n);
		sc.close();

	}

}
