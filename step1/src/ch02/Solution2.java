package ch02;

public class Solution2 {
    public int solution(int n) {
        int answer = 0;

        while (n > 0) {
            answer = answer + (n % 10);
            n = n / 10;
        }
        return answer;
    }
}
