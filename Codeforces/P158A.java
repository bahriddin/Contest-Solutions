package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class P158A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),
            k = in.nextInt(),
            res = 0;
        int[] s = new int[n];

        for (int i = 0; i < n; i++) {
            s[i] = in.nextInt();
        }
        Arrays.sort(s);
        for (int i = n-1; i >= 0 ; i--) {
            if (s[i] > 0 && s[i] >= s[n - k]) {
                res += 1;
            }
        }
        System.out.println(res);
    }
}
