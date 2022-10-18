package ch08;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    int [] arr1 = { 1,2,3,4,5};
    public int[] solution(int[] arr) {
        int[] answer = {}; //답을 return할 배열
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (arr.length <= 1) //arr의 길이가 1보다 작은경우(0,1)
        {
            answer = new int[1];
            answer[0] = -1; //-1을 저장
        } else {
            for (int i = 0; i < arr.length; i++) {
                list.add(arr[i]); //list에 arr의 값들을 저장
            }
            int min_index = list.indexOf(Collections.min(list)); //최소값의 index를 변수에 저장
            list.remove(min_index); //최소값 제거
            answer = new int[list.size()];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = list.get(i); //answer 배열에 list의 값들을 저장
            }
        }
        return answer;
    }
}
