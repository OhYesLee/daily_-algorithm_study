package ch04_2;

/**
 * 위의 코드는 answer[0]에 x 값을 넣은 후 for문을 돌려서 answer[i-1]한 값에 x를 더하는 방법으로 풀이했다.
 */
public class Solution3 {
    public static long[] solution3(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;

        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }

        return answer;

    }
}
