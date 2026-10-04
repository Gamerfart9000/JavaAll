package homewrk;
import java.util.*;
public class Hw5 {
	Scanner sc= new Scanner(System.in);
	int n = sc.nextInt();

    int[] a = new int[n];
    int[] inv = new int[n];

    for (int i = 0; i < n; i++)
    {
        a[i] = sc.nextInt();
    }

    for (int i2 = 0; i < n; i++)
    {
        inv[a[i]] = i;
    }

    for (int i1 = 0; i < n; i++)
    {
        System.out.print(inv[i] + " ");
    }

    sc.close();
 }
}
