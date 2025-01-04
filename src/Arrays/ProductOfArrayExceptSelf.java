package Arrays;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr = {-1,1,0,-3,3};
        int[] ans1 = solution_brute(arr);
        System.out.println(Arrays.toString(ans1));
        int[] ans2 = solution_better(arr);
        System.out.println(Arrays.toString(ans2));
        int[] ans3 = solution_optimal(arr);
        System.out.println(Arrays.toString(ans3));
    }

    static int[] solution_brute(int[] nums){
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = 0; j < nums.length; j++) {
                if(i != j){
                    product *= nums[j];
                }
            }
            ans[i] = product;
        }
        return ans;
    }

    static int[] solution_better(int[] nums){
        int n = nums.length;
        int[] prefix = new int[n];
        int[] postfix = new int[n];
        int[] ans = new int[n];

        //compute prefix array
        prefix[0] = 1;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i-1] * nums[i-1];
        }

        //compute postfix array
        postfix[n-1] = 1;
        for (int i = n-2; i >= 0; i--) {
            postfix[i] = postfix[i+1] * nums[i+1];
        }

        //compute ans array
        for (int i = 0; i < n; i++) {
            ans[i] = prefix[i] * postfix[i];
        }
        return ans;
    }

    static int[] solution_optimal(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];

        //compute prefix product
        int pre = 1;
        for (int i = 0; i < n; i++) {
            ans[i] = pre;
            pre *= nums[i];
        }

        //Compute postfix product and multiply
        int post = 1;
        for (int i = n-1; i >= 0; i--) {
            ans[i] *= post;
            post *= nums[i];
        }
        return ans;
    }
}
