package Codeforces;

import java.util.Scanner;

public class P118A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next(),
                res = "",
                vowels = "aAoOyYeEuUiI";

        for (int i = 0; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) >= 0)
                continue;
            res += "." + Character.toLowerCase(s.charAt(i));

        }

        System.out.println(res);
    }
}
