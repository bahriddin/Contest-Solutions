package Codeforces;

import java.util.Scanner;

/**
 * Url: http://codeforces.com/problemset/problem/706/B
 * Solution:
 * 1) Create arrray with 100001 elements and count numbber of stores where picola costs $i
 * 2) In the kth store add all number of stores with index i < k
 * 3) get the money S Vasiliy has and just print array[S]
 */
public class P706B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] p = new int[100001];
        int q;
        int k;

        for (int i = 0; i < n; i++)
            p[in.nextInt()]++;

        for (int i = 1; i <= 100000; i++)
            p[i] += p[i - 1];

        q = in.nextInt();

        for (int i = 0; i < q; i++) {
            k = in.nextInt();
            if(k >= 100001)
                System.out.println(p[100000]);
            else
                System.out.println(p[k]);
        }
    }
}
