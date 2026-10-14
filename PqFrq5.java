import java.util.*;

public class PqFrq5 {
    public int[] getSubArray(int [] arr, int startInd,int endInd){
        int length=endInd-startInd +1;

        int[] result =new int[length];

        for(int i =startInd;i<= endInd;i++){
            result[i - startInd] =arr[i];
        }
    return result;
    }

    static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        PqFrq5 obj =new PqFrq5();
        System.out.println("Enter the number of element");
        int n= sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        System.out.print("Enter the start index ");
        int startInd=sc.nextInt();
        System.out.print("and end index");
        int endInd= sc.nextInt();

        int[] subArray=obj.getSubArray(arr,startInd,endInd);

        System.out.print("Sub-Array:");
         for (int num:subArray)
             System.out.print((num +" "));
    }

}
