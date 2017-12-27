package Codeforces;

import java.util.Scanner;

public class P231A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),
            res = 0,
            tmp;

        for (int i = 0; i < n; i++) {
            tmp = 0;

            for (int j = 0; j < 3; j++)
                tmp += in.nextInt();

            if (tmp > 1)
                res ++;
        }

        System.out.println(res);
    }
}
