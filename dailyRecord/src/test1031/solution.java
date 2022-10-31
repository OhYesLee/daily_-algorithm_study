package test1031;

import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        if (str.equals(new StringBuffer(str).reverse().toString())) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
