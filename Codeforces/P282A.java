package Codeforces;

import java.util.Scanner;

public class P282A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),
                res = 0;
        String s;

        for (int i = 0; i < n; i++) {
            s = in.next();

            res += (s.indexOf('+') >= 0) ? 1 : -1;

        }

        System.out.println(res);
    }
}
