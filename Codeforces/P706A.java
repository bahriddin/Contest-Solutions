package Codeforces;

import java.util.Scanner;

/**
 * Url: http://codeforces.com/problemset/problem/706/A
 */
public class P706A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int xa = in.nextInt(),
                ya = in.nextInt(),
                n = in.nextInt(),
                carx, cary, carv;
        double res=400, t;

        for (int i = 0; i < n; i++) {
            carx = in.nextInt();
            cary = in.nextInt();
            carv = in.nextInt();
            t = Math.sqrt((xa - carx) * (xa - carx) + (ya - cary) * (ya - cary)) / carv;
            res = (res > t) ? t : res;
        }

        System.out.println(res);
    }
}
