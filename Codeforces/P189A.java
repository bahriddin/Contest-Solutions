package Codeforces;

import java.util.Scanner;

public class P189A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), tmp;
        int[] abc = new int[3],
                s = new int[n+1];
        s[0] = 1;
        for (int i = 0; i < 3; i++)
            abc[i] = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < 3; j++)
                if (i >= abc[j] && s[i - abc[j]] > 0 && s[i - abc[j]] + 1 > s[i])
                    s[i] = s[i - abc[j]] + 1;
        }
        System.out.println(s[n] - 1);
    }
}
