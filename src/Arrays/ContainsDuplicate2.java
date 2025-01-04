package Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3};
        int k = 2;
        boolean ans1 = solution_brute(arr,k);
        System.out.println(ans1);
        boolean ans2 = solution_optimal(arr,k);
        System.out.println(ans2);
    }
    static boolean solution_brute(int[] nums, int k){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if((nums[i] == nums[j]) && Math.abs(i-j) <= k){
                    return true;
                }
            }
        }
        return false;
    }

    static boolean solution_optimal(int[] nums, int k){
        HashMap<Integer,Integer> map= new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i]) && Math.abs(map.get(nums[i])-i)<=k){
                return true;
            }
            map.put(nums[i],i);
        }
        return false;
    }
}
