package ch01_20221004_2;
/**
 *문제 설명
 * 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
 * 제한사항
 * arr은 길이 1 이상, 100 이하인 배열입니다.
 * arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
 * 입출력 예
 * arr	return
 * [1,2,3,4]	2.5
 * [5,5]	5
 */
public class Solution {
    public static void main(String[] args) {
        int x[] = {1, 2, 3, 4, 5};
        GetMean getMean = new GetMean();
        // 아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("평균값1 : " + getMean.getMean(x));

        Solution2 solution2 = new Solution2();
        System.out.println("평균값2 : " + Solution2.solution2(x));


    }
}
