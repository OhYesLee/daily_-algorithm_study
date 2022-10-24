package ch04_03;
////////약수와 배수////////

import java.util.Scanner;

/**
 * 문제
 * 주어진 정수들 중 입력 받은 수의 약수와 배수의 합을 각각 출력하라.
 * 예를 들면,
 * 6개의 정수 2, 3, 5, 12, 18, 24 가 주어지고 12를 입력 받은 경우
 * 12의 약수는 2, 3, 12 이고
 * 12의 배수는 12, 24 이다.
 * 입력형식
 * 첫 줄에 정수의 개수 n (1<= n <=40)을 입력 받는다.
 * 둘째 줄에는 n개의 정수를 한 줄에 입력 받는다.
 * 셋째 줄에는 약수와 배수를 구할 정수 m(1<=m<=100)을 입력 받는다.
 * 출력형식
 * 첫 줄에는 정수 m의 약수의 합을 둘째 줄에는 정수 m의 배수의 합을 출력한다.
 */
public class solutionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nArr = new int[n];

        for (int i = 0; i < n; i++) {
            nArr[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        int divisor = 0;
        int multiple = 0;

        for (int i = 0; i < n; i++) {
            if (m % nArr[i] == 0) divisor += nArr[i];
            if (nArr[i] % m == 0) multiple += nArr[i];

        }

        System.out.println(divisor);
        System.out.println(multiple);
    }
}
////6
////2,3,5,12,18,24
////12

/////==17,36