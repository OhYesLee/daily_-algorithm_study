package ch02;

import java.util.Arrays;
/**
 * 4. contains()
 * Arrays.asList() 메서드를 사용하여 배열을 List로 변경한 뒤,
 * contains() 메서드를 사용해 리스트 내 요소 중에 key값이 존재하는지 여부(true/false)를 확인한다.
 */
public class SolutionTestLot {
    public static void main(String[] args) {
        Integer[] lottos = {44, 1, 0, 0, 31, 25};
        Integer[] win_nums = {31, 10, 45, 1, 6, 19};
        int match = 0;

        for (Integer lotto : lottos) {
            if (Arrays.asList(win_nums).contains(lotto)) {
                match++;
            }
        }

        System.out.printf("번호가  %d개 일치합니다. %d등 당첨!", match, Math.min(7 - match, 6));
    }
}
