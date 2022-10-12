package ch04_3;

/**
 * 가장 작은 x을 찾는 것이므로 i = 2부터 n까지 반복하며 증가, 나머지가 1이 되면 return.
 * n % n - 1은 무조건 나머지가 1이므로 for문에서 항상 1이 되는 수를 찾을 수 있음.
 */
public class Solution {
    public int solution(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 1) {
                return i;
            }
        }
        return -1;
    }
}
