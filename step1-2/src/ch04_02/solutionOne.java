package ch04_02;

import java.util.ArrayList;
import java.util.Arrays;

public class solutionOne {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] temp = new int[3];
        int[] cnt = new int[3];
        int[] h1 = {1, 2, 3, 4, 5};
        int[] h2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] h3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int idx1 = 0, idx2 = 0, idx3 = 0;

        for(int i = 0; i < answers.length; i++){
            if(idx1 == 5) idx1 = 0;
            if(idx2 == 8) idx2 = 0;
            if(idx3 == 10) idx3 = 0;

            if(answers[i] == h1[idx1++]) cnt[0]++;
            if(answers[i] == h2[idx2++]) cnt[1]++;
            if(answers[i] == h3[idx3++]) cnt[2]++;
        }

        for(int i = 0; i < 3; i++){
            temp[i] = cnt[i];
        }

        Arrays.sort(temp);
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < 3; i++){
            if(temp[2] == cnt[i]){
                result.add(i+1);
            }
        }

        answer = new int[result.size()];

        for(int i = 0; i < answer.length; i++){
            answer[i] = result.get(i);
        }

        return answer;
    }
}
