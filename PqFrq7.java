import java.util.*;
public class PqFrq7 {
    public ArrayList<Integer> findfactors(int n){
        ArrayList<Integer> factors= new ArrayList<>();

        for(int i=1;i<=n;i++){
            if(n%i==0)
                factors.add(i);
        }
        return factors;
    }

    static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number to find its factors");
        int n=sc.nextInt();

        PqFrq7 obj= new PqFrq7();

        ArrayList<Integer>factors = obj.findfactors(n);

        System.out.print("Factors of" + n +"is"+factors);
    }
}
