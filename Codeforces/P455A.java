package Codeforces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Url: http://codeforces.com/problemset/problem/455/A
 */
public class P455A {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),
                tmp;
        long[] s;
        HashMap<Integer, Integer> dict = new HashMap<>();
        for(int i = 0; i < n; i++) {
            tmp = in.nextInt();
            if (dict.containsKey(tmp))
                dict.replace(tmp, dict.get(tmp) + 1);
            else
                dict.put(tmp, 1);
        }
        s = new long[dict.size() + 1];
        int i = 1;
        for (Map.Entry<Integer, Integer> entry: dict.entrySet()) {
            int k = entry.getKey(),
                v = entry.getValue();
            tmp = k * v;
            if (i == 1) {
                s[i] = tmp;
            } else if (!dict.containsKey(k - 1)) {
                s[i] = s[i - 1] + tmp;
            } else if (s[i - 2] + tmp > s[i - 1]){
                s[i] = s[i - 2] + tmp;
            } else {
                s[i] = s[i - 1];
            }

            i++;
        }
        System.out.println(s[dict.size()]);
    }

}
