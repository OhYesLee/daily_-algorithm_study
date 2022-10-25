package sh05_02;

public class solutionTwo {
    public long solution(int a, int b) {
        long answer = 0;
        if (a > b) {
            for (int i = b; i <= a; i++) {
                answer = answer + i;
            }
        } else if (b > a) {
            for (int i = a; i <= b; i++) {
                answer = answer + i;
            }
        } else {
            answer = a;
        }
        return answer;
    }
}
