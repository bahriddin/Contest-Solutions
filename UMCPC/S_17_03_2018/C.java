package UMCPC.S_17_03_2018;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * Time limit exceeded
 */
public class C {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),
            m = in.nextInt();
        HashMap<Integer, List<Integer>> nums = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int tmp = in.nextInt();
            if (!nums.containsKey(tmp)) {
                nums.put(tmp, new ArrayList<>());
            }
            nums.get(tmp).add(i+1);
        }

        int k, v;
        do {
            k = in.nextInt();
            v = in.nextInt();
            if (nums.containsKey(v) && nums.get(v).size() >= k) {
                System.out.println(nums.get(v).get(k - 1));
            } else {
                System.out.println(0);
            }
        } while (in.hasNext());

    }
}
