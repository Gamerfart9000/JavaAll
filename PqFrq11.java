import java.util.*;

public class PqFrq11 {
  public List<List<Integer>> permute(int [] nums){
      List<List<Integer>> ans =new ArrayList<>();
      backtrack(ans,new ArrayList<>(),nums);
      return ans;

    }
    private void backtrack(List<List<Integer>> ans ,List<Integer> curr,int[] nums){
      if(curr.size() == nums.length){
          ans.add(new ArrayList<>(curr));
          return;
      }
      for(int num:nums){
          if(curr.contains(num))
              continue;
          curr.add(num);
          backtrack(ans, curr, nums);
          curr.remove(curr.size() -1);
      }
    }
    static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int n= sc.nextInt();

      int [] nums=new int[n];
      System.out.print("Enter"+n+"numbers");

      for(int i=0;i<n;i++){
          nums[i]= sc.nextInt();
      }
      sc.close();

      PqFrq11 sol=new PqFrq11();
      List<List<Integer>> result = sol.permute(nums);
      System.out.print("All permutations" +result);
    }
}
