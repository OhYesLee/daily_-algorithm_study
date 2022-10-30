package test1030;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bf.readLine().split(" ");

        String a = str[0];
        String b = str[1];
        String c = str[2];
        String d = str[3];

        long x = Long.parseLong(a + b);
        long y = Long.parseLong(c + d);

        System.out.println(x + y);
    }
}
