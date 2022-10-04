package ch01_3;

public class SumDivisor {
    public int sumDivisor(int num) {
        int answer2 = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) answer2 += i;
        }
        return answer2 + num;
    }
}

