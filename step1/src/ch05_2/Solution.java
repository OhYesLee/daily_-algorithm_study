package ch05_2;

/**
 * 이번 문제는 매개변수로 주어지는 a와 b의 대소 관계를 먼저 따진 후, 작은 값부터 큰 값까지의 합을 구하는 문제다.
 * 처음에는 if문을 이용해서 대소 관계를 구할까 했는데
 * Math.max가 생각나서 Math.max와 Math.min 메서드를 사용했다.
 */
public class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        for (int i = min; i <= max; i++) {
            answer += i;
        }
        return answer;
    }
}
