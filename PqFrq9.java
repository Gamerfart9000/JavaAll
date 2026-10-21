import java.util.*;

public class PqFrq9 {
    public List<List<Integer>> subset(int [] num){
        List<List<Integer>> result =new ArrayList<>();

        result.add(new ArrayList<>());

        for( int nums :num){
            int n= result.size();

            for(int i=0;i<n;i++){
                List<Integer> newsubset = new ArrayList<>(result.get(i));
                newsubset.add(nums);
                result.add(newsubset);
            }
        }
        return result;
    }
    static void main(String[] args){
        PqFrq9 sol=new PqFrq9();
        int[] num={1,2,3,4};
        List<List<Integer>> result =sol.subset(num);
        System.out.print(result);
    }
}
