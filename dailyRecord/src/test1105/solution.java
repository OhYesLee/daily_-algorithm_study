package test1105;

import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s, e;
        while (true) {
            s = sc.nextInt();
            e = sc.nextInt();
            if ((s >= 2 && s <= 9) && (e >= 2 && e <= 9)) break;
            else {
                System.out.println("INPUT ERROR!");
            }
        }

        if (s < e) {
            for (int i = 1; i <= 9; i++) {
                for (int j = s; j <= e; j++) {
                    System.out.printf("%d * %d = %2d", j, i, j * i);
                    if (j != e) System.out.print("   ");
                }
                System.out.println();
            }
        } else {
            for (int i = 1; i <= 9; i++) {
                for (int j = s; j >= e; j--) {
                    System.out.printf("%d * %d = %2d", j, i, j * i);
                    if (j != e) System.out.print("   ");
                }
                System.out.println();
            }
        }
    }
}
