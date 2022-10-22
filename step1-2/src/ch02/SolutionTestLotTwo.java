package ch02;

import java.util.Arrays;
/**
 * 3. anyMatch()
 * Arrays.stream(int[] array) 메서드를 사용하여 int 배열을 IntStream으로 변경한 뒤,
 * .anyMatch() 메서드를 사용해 요소 중에서 key값과 일치하는 값이 존재하는지 여부(true/false)를 확인한다.
 */
public class SolutionTestLotTwo {

    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        int match = 0;

        for (int lotto : lottos) {
            if (Arrays.stream(win_nums).anyMatch(i -> i == lotto)) {
                match++;
            }
        }

        System.out.printf("번호가  %d개 일치합니다. %d등 당첨!", match, Math.min(7 - match, 6));
    }
}
