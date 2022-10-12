package ch05_2;

public class Solution5 {
    public class SumBtwTwoInt {

        // a와 b 두 정수를 매개변수로 받고, 긴 정수를 리턴값으로 돌려주는 메소드 생성
        public long solution1(int a, int b) {

            // answer값을 선언(0은 한자리 숫자이기 때문에 int 범위내에 있어서
            // 'L'을 표기하지 않아도 된다)
            long answer = 0;

            // a가 b보다 작을 때
            if (a < b) {
                // a로 초기화 된 정수 i를 b의 값과 같아질 때까지 answer값에 더한다.
                for (int i = a; i <= b; i++) {
                    answer += i;
                }

                // b가 a보다 작을 때
            } else if (b < a) {
                // b로 초기화 된 정수 i를 a의 값과 같아질 때까지 answer값에 더한다.
                for (int i = b; i <= a; i++) {
                    answer += i;
                }
                // a와 b가 같다면
            } else {
                answer = a; // a를 answer값으로 돌려준다. (answer = b; 라고 해도 무관)
            }
            return answer;
        }

    }
}
