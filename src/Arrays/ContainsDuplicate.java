package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2};
        boolean ans1 = solution_brute(arr);
        System.out.println(ans1);
        boolean ans2 = solution_better(arr);
        System.out.println(ans2);
        boolean ans3 = solution_optimal(arr);
        System.out.println(ans3);
    }
    static boolean solution_brute(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    static boolean solution_better(int[] nums){
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }

    static boolean solution_optimal(int[] nums){
        Set<Integer> visited = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(visited.contains(nums[i])){
                return true;
            }
            visited.add(nums[i]);
        }
        return false;
    }
}
