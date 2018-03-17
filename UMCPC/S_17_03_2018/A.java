package UMCPC.S_17_03_2018;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(),
            c = 0;
        long p = 0;
        for (int i = 0; i < N; i++) {
            p = in.nextInt();
            c = 0;
            while (!isPalindrome(p)) {
                p = sumReversed(p);
                c++;
            }
            System.out.println(c + " " + p);
        }

    }

    public static long sumReversed(long p) {
        long r = 0;
        long tmp = p;
        while(tmp > 0) {
            r = r * 10 + tmp % 10;
            tmp /= 10;
        }
        return p + r;
    }

    public static boolean isPalindrome(long p) {
        String ps = String.valueOf(p);
        for (int i = 0; i < ps.length() / 2; i++) {
            if (ps.charAt(i) != ps.charAt(ps.length() - 1 - i))
                return false;
        }
        return true;
    }
}
