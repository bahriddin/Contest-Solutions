package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Url: http://codeforces.com/problemset/problem/337/A
 * Solution:
 * 1) sort array
 * 2) find min difference in the range of n elements
 */
public class P337A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),
            m = in.nextInt();
        int[] f = new int[m];
        int minDiff = 1000;

        for (int i = 0; i < m; i++)
            f[i] = in.nextInt();

        Arrays.sort(f);
        for (int i = n - 1; i < m; i++)
            if(f[i] - f[i - n + 1] < minDiff)
                minDiff = f[i] - f[i - n + 1];

        System.out.println(minDiff);
    }
}
