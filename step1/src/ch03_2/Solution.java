package ch03_2;

/**
 * 먼저 매개 변수 x를 String 타입 변수인 xStr를 선언해 x를 문자열로 만들어 xStr에 대입했다.
 * 그리고 xStr의 길이만큼 for문을 돌려 sum 변수에 자릿수를 하나씩 누적 저장했다.
 * 그리고 x가 sum으로 나누어 떨어지지 않으면 false를 리턴하게 코드를 작성했다.
 */
public class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String xStr = x + "";
        int sum = 0;
        for (int i = 0; i < xStr.length(); i++) {
            sum += xStr.charAt(i) - '0';
        }

        if (x % sum != 0) return false;
        return answer;
    }
}
