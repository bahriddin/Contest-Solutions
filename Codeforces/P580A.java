package Codeforces;

import java.util.Scanner;

/**
 * Url: http://codeforces.com/problemset/problem/580/A
 * Find the longest non decreasing subsegment
 */
public class P580A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),
            longest = 0,
            tmp = 0,
            last = 0,
            current;

        for (int i = 0; i < n; i++) {
            current = in.nextInt();
            if (last <= current)
                tmp++;
            else {
                longest = tmp > longest ? tmp : longest;
                tmp = 1;
            }
            last = current;
        }
        longest = tmp > longest ? tmp : longest;

        System.out.println(longest);
    }
}
