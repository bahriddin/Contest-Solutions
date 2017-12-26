package Codeforces;

import java.util.Scanner;

public class P4A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String res = n % 2 == 0 && n > 3 ? "YES" : "NO";
        System.out.println(res);
    }
}
