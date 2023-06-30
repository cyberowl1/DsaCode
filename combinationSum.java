import java.util.ArrayList;
import java.util.List;

public class combinationSum {

        public static  List<List<Integer>> result;
        static void helper(int[] candidates, int target, int i, List<Integer> lst){
            if(i==candidates.length)return;
            if(target==0){
                System.out.println(lst);
                result.add(lst);
            }else{

                helper(candidates,target-candidates[i],i+1,lst);
                System.out.println("pushing : "+ candidates[i]);
                System.out.println("target : "+ target);
                lst.add(candidates[i]);
                
                
                helper(candidates,target,i+1,lst);
                lst.remove(Integer.valueOf(candidates[i]));
    
            }
        
        }
        public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
            List<Integer> lst = new ArrayList<Integer>();
            helper(candidates, target,0,lst);
            return result;
        }
    

    public static void main(String[] args) {
        
   int[] candidates = {2,3,6,7}; int target = 7;
   combinationSum2(candidates,target);

    }
}
