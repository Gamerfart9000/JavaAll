package homewrk;

import java.util.*;

public class Hw21 {
	static class Apple {
		int x, y, id;

		Apple(int x, int y, int id) {
			this.x = x;
			this.y = y;
			this.id = id;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Apple[] a = new Apple[n];

		for (int i = 0; i < n; i++) {
			a[i] = new Apple(sc.nextInt(), sc.nextInt(), i);
		}

		Arrays.sort(a, (p, q) -> {
			if (p.x != q.x)
				return p.x - q.x;
			return p.y - q.y;
		});

		int[] ans = new int[n];
		int eaten = 0;
		boolean forward = true;

		int i = 0;

		while (i < n) {
			int j = i;

			// Find all apples in this row
			while (j < n && a[j].x == a[i].x)
				j++;

			if (forward) {
				// Left to right
				for (int k = i; k < j; k++) {
					ans[a[k].id] = eaten++;
				}
			} else {
				// Right to left
				for (int k = j - 1; k >= i; k--) {
					ans[a[k].id] = eaten++;
				}
			}

			forward = !forward;
			i = j;
		}

		for (int x : ans)
			System.out.println(x);
	}
}
