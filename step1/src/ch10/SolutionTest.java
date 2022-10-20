package ch10;
/////로또의 최고 순위와 최저 순위//////

/**
 * 풀이
 * int[] lottos : 민우가 구매한 로또 번호를 담은 배열
 * int[] win_nums : 당첨 번호를 담은 배열
 * 두 배열을 비교하여 최저 순위 계산
 * 로또 번호는 1~45 사이의 값, lottos에서 번호를 알 수 없는 것은 그대로 0으로 둔채, 현재 상태에서 (0을 제외한) lottos의 요소와 win_numbers의 요소가 매칭하는 개수를 확인한다. => 최저 순위
 * lottos 배열에서 0인 값들을 'lottos 배열에 존재하지 않는 당첨번호'의 값으로 매칭해서 최고 순위 계산
 * lottos와 win_numbers의 길이는 무조건 같기 때문에, win_numbers에서 값을 정답으로 대체할 수 있는 0의 숫자만 구해서 '원래 매칭되던 값 개수' + '0개수'을 수행하면 최대 매칭 개수를 구할 수 있다.
 * 순위는 '7-매칭되는숫자개수'로 하되, 매칭되는 숫자가 1개 이하일 경우는 6등으로 통일한다.
 * ex) 매칭되는 숫자 : 6개 => 7-6 = 1등
 * 매칭되는 숫자 : 5개 => 7-5 = 2등
 * 매칭되는 숫자 : 1개 => 7-1 = 6등,
 * 매칭되는 숫자 : 0개 => 7-0 = 최저순위가 6등이므로 6등으로 통일.
 * 최고 순위, 최저 순위를 배열에 담아서 반환.
 */
public class SolutionTest {
    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        int match = 0;

        for (int lotto : lottos) {
            for (int win_num : win_nums) {
                if (lotto == win_num) {
                    match++;
                    break;
                }
            }
        }

        System.out.printf("번호가  %d개 일치합니다. %d등 당첨!", match, Math.min(7 - match, 6));
    }
}
