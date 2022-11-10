package test1110;

import java.util.Arrays;

public class solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            if (budget < d[i]) break;
            else if (budget > 0) {
                budget -= d[i];
                answer++;
            }
        }
        return answer;
    }
}
