package UMCPC.S_17_03_2018;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Wrong answer
 */
public class B
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        while (N != 0)
        {
            long cost = 0;
            int[] nums = new int[N];
            for (int i = 0; i < N; i++) {
                nums[i] = in.nextInt();
            }

            Arrays.sort(nums);
            for (int i = 0; i < N; i++) {
                if(i < 2) {
                    cost += nums[i] * (N - 1);
                }
                else {
                    cost += nums[i] * (N - i);
                }
            }
            System.out.println(cost);

            N = in.nextInt();
        }
    }
}
