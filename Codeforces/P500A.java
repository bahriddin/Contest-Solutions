package Codeforces;

import java.util.Scanner;

/**
 * Url: http://codeforces.com/problemset/problem/500/A
 */
public class P500A {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),
            t = in.nextInt();
        int[] s = new int[n+1];
        for (int i = 1; i < n; i++) {
            s[i] = in.nextInt();
        }

        int tmp = 1;
        do {
            tmp += s[tmp];
            if (tmp == t) {
                System.out.println("YES");
                return;
            }
        } while (tmp < t);


        System.out.println("NO");
    }
}
