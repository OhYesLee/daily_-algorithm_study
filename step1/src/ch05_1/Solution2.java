package ch05_1;
///삼항연산자 ==> 변수 = (조건) ? 참 : 거짓;
/**
 * 이 코드는 나와 비슷한 로직인데 짝수, 홀수를 구해 연산을 하는 부분을 삼항 연산자로 풀이해 더 깔끔하게 보인다.
 * if와 else 부분이 간단한 부분에는 삼항 연산자를 꼭 쓰자!
 */
public class Solution2 {
    public int coll(int num) {
        long n = (long) num;
        for (int i = 0; i < 500; i++) {
            if (n == 1) return i;
            n = (n % 2 == 0) ? n / 2 : n * 3 + 1;
        }
        return -1;
    }
}