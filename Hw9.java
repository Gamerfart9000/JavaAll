package homewrk;
import java.util.*;

public class Hw9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        // Initial ArrayList
        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        int Q = sc.nextInt();

        while (Q-- > 0) {
            int type = sc.nextInt();

            if (type == 1) {
                int p = sc.nextInt();
                int r = sc.nextInt();

                list.add(p, r);

                // Print updated ArrayList
                for (int x : list) {
                    System.out.print(x + " ");
                }
                System.out.println();

            } else if (type == 2) {
                int p = sc.nextInt();
                int index = -1;

                // Search from right to left
                for (int i = list.size() - 1; i >= 0; i--) {
                    if (list.get(i) == p) {
                        index = i;
                        break;
                    }
                }

                System.out.println(index);
            }
        }

        sc.close();
    }
}


