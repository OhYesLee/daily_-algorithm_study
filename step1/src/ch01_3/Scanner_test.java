package ch01_3;

import java.util.Scanner;

public class Scanner_test {
    public static void main(String[] ar) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String[] strs = new String[N];
        for (int i = 0; i < N; i++)
            strs[i] = in.next();

        for (int i = 0; i < N; i++)
            System.out.println("String[" + i + "] : " + strs[i]);

    }
}
