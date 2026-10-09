import java.util.*;
public class PqFrq3 {
    public static int[] removeDuplicate(int [] arr){
        if(arr.length==0)
            return new int[0];
        Arrays.sort(arr);

        int[] temp =new int[arr.length];
        temp[0]=arr[0];
        int uniqueCount =1;

        for(int i =1; i< arr.length;i++){
            if(arr[i] != arr[i-1])
                temp[uniqueCount++]=arr[i];
        }
        return Arrays.copyOf(temp, uniqueCount);

    }
    static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n =sc.nextInt();

        int[]arr = new int[n];
        System.out.println("Enter the elements");
        for(int i=0; i<n ;i++){
            arr[i]=sc.nextInt();
        }
         int[] result=removeDuplicate(arr);

        System.out.println("Array after removing duplicates");
        System.out.println(Arrays.toString(result));

    }
}
