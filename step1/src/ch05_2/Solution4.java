package ch05_2;

public class Solution4 {
    public long solution3_2(int a, int b) {
        long answer = 0;

        // 반복문을 이용하여 바로 작은 값부터 큰 값까지 더해준다
        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            answer += i;
        }
        return answer;
    }
}
