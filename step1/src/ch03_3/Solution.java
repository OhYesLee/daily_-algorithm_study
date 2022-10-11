package ch03_3;

import java.util.Arrays;

/**
 * primitive arrays은 Arrays.sort()를 통한 내림차순을 할 수 없다.
 * Collections.reverseOrder()를 사용하면 error가 발생한다.
 * Object of Array를 사용하면 Collections.reverseOrder()사용 가능하다. ex) Integer, String
 * 그래서 StringBuilder를 사용하여 내림차순으로 정렬.
 */
public class Solution {
    public long solution(long n) {
        String str = String.valueOf(n); //n을 string으로
        char[] s = str.toCharArray();// str을 한자리씩 char array에 저장
        Arrays.sort(s);//오름차순
        String sb = new StringBuilder(new String(s)).reverse().toString();
        //내림차순
        return Long.parseLong(sb);//long type으로 return
    }
}
