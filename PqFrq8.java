import java.util.*;

public class PqFrq8 {
    public int[] extract(int [] num){
        List<Integer> evenList= new ArrayList<>();

        for( int number:num){
            if(number % 2==0)
                evenList.add(number);

        }
        return evenList.stream().mapToInt(i ->i).toArray();
    }

    static void main(String[] args){
        int [] num={1,2,3,4,5,6,7,8,9,10,20};

        PqFrq8 obj= new PqFrq8();
        int[] evenNum=obj.extract(num);

        System.out.print("Even number");
        for(int numbers: evenNum){
            System.out.print(numbers +" ");
        }
    }
}
