package ch07;
/**
 * 이번 문제도 어렵지 않았다. 그리고 예전 문제고, 중간에 한 번 개편돼서 그런지 문제와 다른 코드들이 많이 보였다.
 * 그 점을 제외하면 문제가 워낙 쉽고 간단하다 보니 비슷하게 푼 것 같다.
 * 위의 코드는 처음 제출한 코드가 아니다. 뭔가 코드를 제출하고 보니 불필요한 부분이 보여서 리팩토링했다. 하단 코드는 제출한 코드다.
 */

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
