package Codeforces;

import java.util.Scanner;

public class P96A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int res = 1, tmp = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i-1)) {
                tmp++;
            } else {
                res = tmp > res ? tmp : res;
                tmp = 1;
            }

        }

        if (res >= 7 || tmp >=7)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
