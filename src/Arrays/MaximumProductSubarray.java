package Arrays;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[] arr = {5,3,1,-2,0,-5,8,-3};
        int ans1 = solution_brute(arr);
        System.out.println(ans1);
        int ans2 = solution_optimal(arr);
        System.out.println(ans2);
    }
    static int solution_brute(int[] nums){
        int maxProduct = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int currentProduct = 1;
            for (int j = i; j < nums.length; j++) {
                currentProduct *= nums[j];
                maxProduct = Math.max(maxProduct, currentProduct);
            }
        }
        return maxProduct;
    }

    static int solution_optimal(int[] nums){
        if(nums.length == 0)    return 0;
        int min = nums[0];
        int max = nums[0];
        int ans = max;
        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];
            int temp = Math.max(current, Math.max(max*current,min*current));
            min = Math.min(current, Math.min(min*current, max*current));
            max = temp;

            ans = Math.max(ans, max);
        }
        return ans;
    }
}
