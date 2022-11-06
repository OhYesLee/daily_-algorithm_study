package test1106;

public class solutionTwo {
    public long fibonacci(int num) {
        long answer = 0;
        long[] dp = new long[num + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= num; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[num];
    }
}
