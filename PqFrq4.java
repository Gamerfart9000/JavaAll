import java.util.*;
public class PqFrq4 {
    public boolean isSorted(int [] arr){
        for(int i=1;i< arr.length;i++){
            if(arr[i]< arr[i -1])
                return false;
        }
        return true;
    }
}
void main(String[] args) {
    Scanner sc =new Scanner(System.in);

    System.out.print("Enter the number of elements");
    int n=sc.nextInt();

    int[] arr=new int[n];

    System.out.print("Enter the elements");
    for(int i =0; i<n;i++){
        arr[i]= sc.nextInt();
    }


    PqFrq4 obj =new PqFrq4();
    boolean result= obj.isSorted(arr);

    if(result)
        System.out.println("Sorted");
    else
        System.out.println("Not Sorted");
}