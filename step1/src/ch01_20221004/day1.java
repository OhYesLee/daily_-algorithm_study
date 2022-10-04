package ch01_20221004;
/**
 * 문제 설명
 * 정수 num이 짝수일 경우 Even을 반환하고 홀수인 경우 Odd를 반환하는 함수, solution을 완성해주세요.
 * 제한 조건
 * num은 int 범위의 정수입니다.
 * 0은 짝수입니다.
 * 입출력 예
 * 3	"Odd"
 * 4	"Even"
 */
public class day1 {
    public static void main(String[] args) {
        String str = "1 2 3 4";
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("결과 : " + evenOrOdd.evenOrOdd(3));
        System.out.println("결과 : " + evenOrOdd.evenOrOdd(2));

        Solution solution = new Solution();
        System.out.println("결과 : " + Solution.solution(3));
        System.out.println("결과 : " + Solution.solution(2));

    }
}
