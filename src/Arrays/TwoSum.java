package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1,8,2,15,5};
        int target= 13;
        int[] ans1 = two_sum_brute(arr,target);
        System.out.println(Arrays.toString(ans1));
        int[] ans2 = two_sum(arr, target);
        System.out.println(Arrays.toString(ans2));
    }
    static int[] two_sum_brute(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int remaining = target-arr[i];
                if(arr[j] == remaining){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int[] two_sum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}
