package ch10_01;

import java.math.BigInteger;
import java.util.Scanner;
/////////// 백준 알고리즘 2338번 / 긴자리 계산//////////
public class SolutionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();

        sc.close();

        System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.println(a.multiply(b));

    }
}
