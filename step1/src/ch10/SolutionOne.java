package ch10;

import java.util.Arrays;

public class SolutionOne {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int matchCnt = 0;
        int zeroCnt = 0;

        Arrays.sort(lottos);
        Arrays.sort(win_nums);

        // 최저 순위
        for (int lotto : lottos) {
            if (Arrays.binarySearch(win_nums, lotto) >= 0)
                matchCnt++;

            if (lotto == 0)
                zeroCnt++;
        }
        answer[1] = Math.min(7 - matchCnt, 6);

        // 최고 순위
        answer[0] = Math.min(7 - (matchCnt + zeroCnt), 6);

        return answer;
    }
}
