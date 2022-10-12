package ch05_1;

/**
 * 처음에 코드 실행을 했었을 때 계속 테스트 3번이 ‘-1’이 리턴되지 않고 488이 리턴되었다.
 * 그래서 syso를 찍어보니 매개변수 num으로 들어오는 값은 int 타입으로 표현할 수 있는 값이 들어오지만,
 * 연산을 하다보면 int 타입을 넘어서는 범위의 값이 나와서 계속 488이 나오는 것이었다.
 * 그래서 처음에 num 값을 long 타입인 number에 대입했고, number로 연산을 수행하니 정상적으로 -1를 리턴했다.
 */
public class Solution {
    public int solution(int num) {
        long number = num;
        int answer;
        for (answer = 0; answer < 500; answer++) {
            if (number == 1) {
                return answer;
            } else {
                if (number % 2 == 0) {
                    number /= 2;
                } else {
                    number = number * 3 + 1;
                }
            }
        }
        return -1;
    }
}
