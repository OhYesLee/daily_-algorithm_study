package test1031;

import java.util.Scanner;

public class solution2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();

        while (true) {
            if (str.length() >= 10) {
                System.out.println(str.substring(0, 10));
            } else {
                System.out.println(str);
                break;
            }
            str = str.substring(10);
        }

    }
}
