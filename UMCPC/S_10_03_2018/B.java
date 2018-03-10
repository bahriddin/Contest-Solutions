package UMCPC.S_10_03_2018;

import java.util.HashMap;
import java.util.Scanner;

//Unsuccessful try
public class B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int[] cases;
        HashMap<Integer, String> rel;
        for (int i = 1; i <= T; i++) {
            rel = new HashMap<>();
            int max = 0;
            for (int j = 0; j < 10; j++) {
                String url = in.next();
                int r = in.nextInt();

                max = r > max ? r : max;

                if (rel.containsKey(r))
                    rel.put(r, rel.get(r) + "\n" + url);
                else
                    rel.put(r, url);
            }
            System.out.println("Case #" + i);
            System.out.println(rel.get(max));
        }
    }

}
