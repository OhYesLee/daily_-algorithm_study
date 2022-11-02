package test1102;

import java.math.BigInteger;

/**
 * math 라이브러리의 BigInteger을 사용하여 최대공약수(GCD)를 간단하게 구하였다.
 * 그 뒤에 문제에 나온 조건에 대한 식을 사용하여 문제를 해결했다.
 * w길이와 h길이의 최대 공약수 만큼 사용할 수 없는 사각형의 덩어리가 나오고
 * 해당 사각형의 갯수를 구하는 방법은 w길이를 최대공약수로 나눈 수와 h길이를
 * 최대공약수로 나눈 수를 더한 뒤 1을 빼주면 나오게 된다.
 */
public class solution {
    public long solution(int w, int h) {
        int gcd = BigInteger.valueOf(w).gcd(BigInteger.valueOf(h)).intValue();
        long answer = ((long) w * (long) h) - (((w / gcd) + (h / gcd) - 1) * gcd);
        return answer;
    }
}
