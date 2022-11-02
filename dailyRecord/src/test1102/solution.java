package test1102;

import java.math.BigInteger;

public class solution {
    public long solution(int w, int h) {
        int gcd = BigInteger.valueOf(w).gcd(BigInteger.valueOf(h)).intValue();
        long answer = ((long) w * (long) h) - (((w / gcd) + (h / gcd) - 1) * gcd);
        return answer;
    }
}
