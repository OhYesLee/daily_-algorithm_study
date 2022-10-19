package ch09;

public class Solution {
    public String solution(String s) {
        String answer = "";
        int l = s.length();
        int m = l / 2;
        if (l % 2 == 0) {
            for (int i = m - 1; i <= m; i++) {
                answer += s.charAt(i) + "";
            }
        } else {
            answer = s.charAt(m) + "";
        }
        return answer;
    }
}
