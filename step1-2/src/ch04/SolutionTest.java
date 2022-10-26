package ch04;
///////[백준 알고리즘] 2960번 / 에라토스테네스의 체//////////

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 문제
 * 에라토스테네스의 체는 N보다 작거나 같은 모든 소수를 찾는 유명한 알고리즘이다.
 * <p>
 * 이 알고리즘은 다음과 같다.
 * 2부터 N까지 모든 정수를 적는다.
 * 아직 지우지 않은 수 중 가장 작은 수를 찾는다. 이것을 P라고 하고, 이 수는 소수이다.
 * P를 지우고, 아직 지우지 않은 P의 배수를 크기 순서대로 지운다.
 * 아직 모든 수를 지우지 않았다면, 다시 2번 단계로 간다.
 * N, K가 주어졌을 때, K번째 지우는 수를 구하는 프로그램을 작성하시오.
 * 입력
 * 첫째 줄에 N과 K가 주어진다. (1 ≤ K < N, max(2, K) < N ≤ 1000)
 * 출력
 * 첫째 줄에 K번째 지워진 수를 출력한다.
 */
public class SolutionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        sc.close();

        List<Integer> list = new ArrayList<Integer>();
        int count = 0;

        for (int i = 2; i <= n; i++) {
            list.add(i);
        }

        while (true) {
            int i = list.get(0);
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) % i == 0) {
                    if (k - 1 == count) {
                        System.out.println(list.get(j));
                        return;
                    } else {
                        list.remove(j);
                        count++;
                    }
                }
            }
        }
    }
}