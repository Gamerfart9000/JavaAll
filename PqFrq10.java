
import java.util.*;

public class PqFrq10 {

    public List<List<Integer>> subsetDup(int [] num){
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(num);
        backtrack(0,num ,new ArrayList<>(),result);
        return result;
    }

    private void backtrack(int start,int[] num,List<Integer> curr , List<List<Integer>> result){
        result.add(new ArrayList<>(curr));

        for(int i= start;i<num.length; i++){
            if( i>start && num[i]== num[i-1]){
                continue;
            }
            curr.add(num[i]);
            backtrack(i+1,num,curr,result);
            curr.remove(curr.size()-1);
        }

    }
    static void main(String[] args){
        PqFrq10 sol=new PqFrq10();
        int[] num ={1,2,2};
        List<List<Integer>> result =sol.subsetDup(num);
        System.out.print(result);
    }
}
