package Codeforces;

import java.util.Scanner;

public class P71A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s;
        for (int i = 0; i < n; i++) {
            s = in.next();

            if (s.length() > 10)
                s = "" + s.charAt(0) + (s.length() - 2) + s.charAt(s.length()-1);

            System.out.println(s);
        }

    }
}
