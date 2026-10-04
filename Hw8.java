package homewrk;
import java.util.*;

public class Hw8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        // Input matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Find saddle price
        for (int i = 0; i < n; i++) {

            // Find minimum element in the current row
            int min = matrix[i][0];
            int minCol = 0;

            for (int j = 1; j < n; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    minCol = j;
                }
            }

            // Check if it is maximum in its column
            boolean isSaddle = true;

            for (int k = 0; k < n; k++) {
                if (matrix[k][minCol] > min) {
                    isSaddle = false;
                    break;
                }
            }

            if (isSaddle) {
                System.out.println(min);
                return;
            }
        }

        // No saddle price found
        System.out.println("Invalid input");
        sc.close();
    }
    
}


