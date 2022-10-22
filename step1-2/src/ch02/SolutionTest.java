package ch02;
///////[백준 알고리즘] 9093번 / 단어 뒤집기///////

import java.util.Scanner;

/**
 * 문제
 * 문장이 주어졌을 때, 단어를 모두 뒤집어서 출력하는 프로그램을 작성하시오.
 * 단, 단어의 순서는 바꿀 수 없다. 단어는 영어 알파벳으로만 이루어져 있다.
 * 입력
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있으며, 문장이 하나 주어진다.
 * 단어의 길이는 최대 20, 문장의 길이는 최대 1000이다. 단어와 단어 사이에는 공백이 하나 있다.
 * 출력
 * 각 테스트 케이스에 대해서, 입력으로 주어진 문장의 단어를 모두 뒤집어 출력한다.
 */
public class SolutionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            String[] array = str.split(" ");

            for (int j = 0; j < array.length; j++) {
                System.out.print(new StringBuffer(array[j]).reverse().toString() + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
