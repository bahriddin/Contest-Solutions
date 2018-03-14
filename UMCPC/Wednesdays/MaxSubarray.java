package UMCPC.Wednesdays;

import java.util.Scanner;

public class MaxSubarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] ns = in.nextLine().split(",");
        int[] n = new int[ns.length];
        for (int i = 0; i < ns.length; i++) {
            n[i] = Integer.valueOf(ns[i]);
        }
        System.out.println(maxSubArray(n));
    }

    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE,
                current = Integer.MIN_VALUE;
        for(int i=0; i < nums.length; i++) {
            if(i == 0)
                current = nums[i];
            else {
                current = Math.max(current + nums[i], nums[i]);
            }

            maxSum = Math.max(current, maxSum);
        }

        return maxSum;
    }
}
