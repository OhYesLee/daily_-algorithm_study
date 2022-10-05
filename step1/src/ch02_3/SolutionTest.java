package ch02_3;

import ch01_3.Solution;

import java.util.Arrays;

/**
 * 문제 설명
 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
 * <p>
 * 제한 조건
 * n은 10,000,000,000이하인 자연수입니다.
 * 입출력 예
 * n	return
 * 12345	[5,4,3,2,1]
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        System.out.println(Arrays.toString(solution1.solution(12345)));
        System.out.println("=======================");
        Solution2 solution2 = new Solution2();
        System.out.println(Arrays.toString(solution2.solution(12345)));
    }
}
