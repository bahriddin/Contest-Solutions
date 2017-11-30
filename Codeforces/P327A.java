package Codeforces;

import java.util.Scanner;

/**
 * Url: http://codeforces.com/problemset/problem/327/A
 */
public class P327A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),
            base = 0,
            tmp =0,
            max = 0;
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
            base += b[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i == j)
                    tmp = base + (b[j] == 0 ? 1 : -1);
                else
                    tmp += (b[j] == 0 ? 1 : -1);
                max = max < tmp ? tmp : max;
            }
        }
        System.out.println(max);
    }
}
