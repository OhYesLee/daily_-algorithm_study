package ch07_2_re;

import java.util.ArrayList;
import java.util.Arrays;

public class SolutionOne {
    int [] arr = {10};
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            arr[0] = -1;
            return arr;
        }
        int[] copyArr = arr.clone();
        Arrays.sort(copyArr);

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < copyArr.length; i++) {
            if (arr[i] != copyArr[0])
                list.add(arr[i]);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

}
