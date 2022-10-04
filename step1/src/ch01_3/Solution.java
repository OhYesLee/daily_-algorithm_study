package ch01_3;

public class Solution {
    public static String ansewr1;

    public int solution(int n) {

        int answer1 = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) answer1 += i;
        }
        return answer1;
    }
}
