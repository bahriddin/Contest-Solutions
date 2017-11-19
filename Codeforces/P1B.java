package Codeforces;

import java.util.Scanner;

/**
 * Url: http://codeforces.com/problemset/problem/1/B
 */
public class P1B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int r, c;
        String cs;
        int n;
        String s;
        for (int i = 0; i < t; i++) {
            s = in.next();
            if (s.charAt(0) == 'R' && s.charAt(1) >= '0' && s.charAt(1) <= '9') {
                // "R..." to "A..."
                n=1;
                r=0;
                c=0;
                cs="";
                while(s.charAt(n)<=57) {
                    r = r * 10 + Character.getNumericValue(s.charAt(n));
                    n++;
                }
                n++;
                while(n < s.length()) {
                    c = c * 10 + Character.getNumericValue(s.charAt(n));
                    n++;
                }
                while(c-- != 0) {
                    cs = (char)(c % 26 + 65) + cs;
                    c /= 26;
                }
                System.out.println(cs + r);
            } else {
                // "A..." to "R..."
                n=0;
                r=0;
                c=0;
                while(s.charAt(n) >='A' && s.charAt(n) <= 'Z') {
                    c = c * 26 + (int) s.charAt(n) - 64;
                    n++;
                }
                while(n < s.length()) {
                    r = r * 10 + Character.getNumericValue(s.charAt(n));
                    n++;
                }
                System.out.println("R" + r + "C" + c);
            }
        }
    }
}
