package ch08_2;

public class SolutionOne {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (!signs[i]) absolutes[i] *= -1;
            answer += absolutes[i];
        }
        return answer;
    }

    public SolutionOne solution(int i) {
        return new SolutionOne();
    }
}
