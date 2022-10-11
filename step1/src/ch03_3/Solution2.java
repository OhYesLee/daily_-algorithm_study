package ch03_3;

import java.util.Arrays;
import java.util.Collections;

/**
 * String array를 사용하면 Collections.reverseOrder()를 사용해서 정렬 할 수 있다.
 */
public class Solution2 {
    public long solution2(long n) {
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s);
        }
        return Long.parseLong(sb.toString());
    }
}
