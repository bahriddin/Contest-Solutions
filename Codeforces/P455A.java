package Codeforces;

import java.util.Scanner;

/**
 * Url: http://codeforces.com/problemset/problem/455/A
 */
public class P455A {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long tmp;
        long[] s = new long[100001];

        for (int i = 0; i < n; i++)
            s[in.nextInt()]++;

        for (int i = 2; i <= 100000; i++) {
            tmp = i * s[i];
            if (s[i-2] + tmp < s[i-1])
                s[i] = s[i-1];
            else
                s[i] = s[i-2] + tmp;
        }


        System.out.println(s[100000]);
    }

}
