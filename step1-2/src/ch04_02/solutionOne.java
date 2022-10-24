package ch04_02;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 이번 문제는 코드를 작성하면 할수록 생각보다 길어져서 ‘이렇게 푸는 게 맞나’라는 생각이 든 문제였다.
 * 먼저 문제의 답이 담겨있는 answers 배열의 길이만큼 for문을 돌려 수포자들이 찍은 문제들과 맞춰보고
 * 답이 맞으면 cnt 배열에 값을 증가시킨다. 나는 cnt 배열의 값을 유지하기 위해 temp 배열에 cnt의 값을 옮겨 담고
 * temp을 정렬시켰다. 그리고 배열의 추가, 삭제를 쉽게 하기 위해 ArrayList인 result를 선언하고,
 * or문을 또 돌려 정렬로 인해 제일 큰 값이 맨 마지막 인덱스에 있으니 temp[2]와 cnt[i]가 같으면 result에 i+1를 저장했다.
 * 그리고 그걸 또 answer에 넣으려고 또 for문 사용..! 다른 사람들이 작성한 코드를 보고 내 코드를 다시 보니까 불필요한 부분이 많은 것 같다.
 */
public class solutionOne {
    int [] abc = {1,2,3,4,5};
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
