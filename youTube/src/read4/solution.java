package read4;

import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        sc.close();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isUpperCase(c)) {
                System.out.print(String.valueOf(c).toLowerCase());
            } else {
                System.out.print(String.valueOf(c).toUpperCase());
            }
        }
        System.out.println();
    }
}
