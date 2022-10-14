package ch07;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = answer = new int[1];
        ArrayList<Integer> list = new ArrayList<>();

        for (int n : arr)
            if (n % divisor == 0) list.add(n);

        if (list.size() == 0) {
            answer[0] = -1;
        } else {
            answer = new int[list.size()];
            Collections.sort(list);

            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
        }
        return answer;
    }

}
