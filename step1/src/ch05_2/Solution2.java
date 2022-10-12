package ch05_2;

public class Solution2 {
    public long solution2(int a, int b) {
        long answer = 0;

        if (a < b) {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        } else
            for (int i = b; i <= a; i++) {
                answer += i;
            }
        return answer;
    }
}
