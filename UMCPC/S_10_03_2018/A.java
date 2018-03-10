package UMCPC.S_10_03_2018;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] group;

        System.out.println("Lumberjacks:");

        for (int i = 0; i < n; i++) {
            group = new int[10];
            for (int j = 0; j < 10; j++) {
                group[j] = in.nextInt();
            }
            if(isOrdered(group))
                System.out.println("Ordered");
            else
                System.out.println("Unordered");
        }
    }

    private static boolean isOrdered(int[] ar) {
        int ord = 0;

        for (int i = 1; i < ar.length; i++) {
            if (ord == 0) {
                if (ar[i] > ar[i-1])
                    ord = 1;
                else if (ar[i] < ar[i-1])
                    ord = -1;
            }

            if ((ord > 0 && ar[i] < ar[i-1]) || (ord < 0 && ar[i] > ar[i-1]))
                return false;
        }

        return true;
    }
}
