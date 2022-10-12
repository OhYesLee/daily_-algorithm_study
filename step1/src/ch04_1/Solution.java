package ch04_1;

/**
 * 어려운 문제가 아니라 따로 설명하지 않아도 될 것 같다.
 * 그냥 조금 신경 써야하는 건 num의 자료형을 int가 아닌 long으로 해야한다.
 * int로 했더니 테스트 케이스 13, 14번이 실패로 떴었다.
 */
public class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num = x;
        for (int i = 0; i < answer.length; i++) {
            answer[i] = num;
            num += x;
        }
        return answer;
    }
}
