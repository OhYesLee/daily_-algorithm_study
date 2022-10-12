package ch04_3;

public class Solution2 {
    public int solution2(int n) {
        int answer = 0;

        // 최소값부터 n -1 까지 반복문 반복
        for (int i = 2; i < n; i++) {
            // 나머지가 1인 경우
            if (n % i == 1) {
                // answer에 값 넣어주고 반복문 종료
                answer = i;
                break;
            }
        }
        return answer;
    }
}
