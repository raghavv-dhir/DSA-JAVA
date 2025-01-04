package Arrays;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int ans1 = solution_brute(arr);
        System.out.println(ans1);
        int ans2 = solution_optimal(arr);
        System.out.println(ans2);
    }
    static int solution_brute(int[] nums){
        int maxSum = Integer.MIN_VALUE; // smallest possible
        //generate all possible sub arrays
        for (int i = 0; i < nums.length; i++) {
            int currentSum= 0;
            for (int j = i; j < nums.length; j++) {
                currentSum += nums[j];
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }

    static int solution_optimal(int[] nums){
        int currentSum = 0;
        int maxSum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(currentSum < 0)  currentSum = 0;
            currentSum += nums[i];
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
