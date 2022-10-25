package ch05;
//////////쌍의 합////////////

import java.util.Scanner;

/**
 * 문제
 * 1보다 크거나 같고 12보다 작거나 같은 자연수 n이 주어졌을 때, 합이 n이 되는 두 자연수의 쌍을 찾는 프로그램을 작성하시오.
 * 예를 들어, 5가 주어진 경우 가능한 쌍은 1,4와 2,3이 있다. 두 수는 항상 달라야 한다. 즉, 3,3은 올바른 쌍이 아니다. 또, 첫 번째 수가 두 번째 수보다 작아야 한다.
 * 출력하는 쌍은 항상 사전순으로 출력해야 한다. 즉, 각 쌍의 작은 수로 비교를 해야 한다. 예를 들어 1,5는 2,4보다 사전순으로 앞선다.
 * 입력
 * 첫째 줄에 테스트 케이스의 수 (< 100)가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, n이 주어진다.
 * 출력
 * 각 테스트 케이스마다 n을 만드는 쌍을 사전순으로 출력한다. n을 만드는 쌍이 없는 경우에는 아무것도 출력하지 않는다.
 * 예제 출력 형식을 참고해 출력한다.
 * 출력 형식
 * 정확한 출력 형식은 제출에서 언어를 Java로 설정하면 확인할 수 있다.
 * 예제 입력 1
 * 4
 * 2
 * 3
 * 4
 * 5
 * 예제 출력 1
 * Pairs for 2:
 * Pairs for 3: 1 2
 * Pairs for 4: 1 3
 * Pairs for 5: 1 4, 2 3
 */
public class solutionTest {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int cnt = 0;

            System.out.print("Pairs for " + n + ": ");
            for (int i = 1; i < n; i++) {
                for (int j = 1; j < n; j++) {
                    if (i + j == n && i < j) {
                        if (cnt == 0) {
                            cnt++;
                            System.out.print(i + " " + j);
                        } else {
                            System.out.print(", " + i + " " + j);
                        }
                    }
                }
            }

            System.out.println();
        }
    }
}
