package solutions;import java.util.HashMap;
import java.util.Map;

public class TwoSumSolution {
    public static void main(String[] args) {
        TwoSumSolution sol = new TwoSumSolution();
        int[] result = sol.twoSum(new int[]{2,7,11,15},9);
        System.out.println("" + result[0] + result[1]);
    }
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> temp = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(temp.containsKey(target-nums[i])){
                return new int[]{temp.get(target-nums[i]),i};
            } else {
                temp.put(nums[i],i);
            }
        }
        return new int[0];
    }
}