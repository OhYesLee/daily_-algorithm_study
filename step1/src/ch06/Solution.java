package ch06;

/**
 *변수 a에 매개 변수로 넘겨진 phone_number를 처음부터 총 길이의 -4한만큼 잘라서 저장했다.
 * 그리고 replaceAll() 메서드로 자른 문자열의 모든 글자를 *로 변경했다.
 * 그리고 phone_number의 맨 뒤 네글자를 담은 back 변수를 만들어 a에 a + back 문자열 연산을 해 a를 리턴했다.
 */
public class Solution {
    public String solution(String phone_number) {
        String a = phone_number.substring(0, phone_number.length() - 4);
        a = a.replaceAll(".", "*");

        String back = phone_number.substring(phone_number.length() - 4);
        a = a + back;
        return a;
    }
}
