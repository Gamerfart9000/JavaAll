import java.util.*;

public class PqFrq6 {
    public int[] getUnique(int[] arr1,int[] arr2){
        Set<Integer> set =new HashSet<>();

        for(int num :arr1)
            set.add(num);

        for( int num:arr2)
            set.add(num);

        int[] result =new int[set.size()];
        int index=0;

        for(int num:set){
            result[index]=num;
            index++;
        }
        return result;
    }


    static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        PqFrq6 obj =new PqFrq6();
        System.out.print("Enter the size of first array:");
        int n1=sc.nextInt();

        int[] arr1=new int[n1];
        System.out.print("Enter the elements of first array");
        for(int i=0;i<n1;i++)
            arr1[i] =sc.nextInt();


        System.out.print("Enter the size of second array:");
        int n2=sc.nextInt();

        int[] arr2=new int[n2];
        System.out.print("Enter the elements of second array");
        for(int i=0;i<n2;i++)
            arr2[i] =sc.nextInt();

        int[] result=obj.getUnique(arr1,arr2);

        System.out.print("Unique elements from both arrays:");
        for(int num:result)
            System.out.print(num+" ");
    }
}
