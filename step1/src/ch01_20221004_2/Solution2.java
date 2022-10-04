package ch01_20221004_2;

public class Solution2 {
    public static double solution2(int[] arr) {
        double answer = 0;
        for (int n : arr) {
            answer += n;
        }
        return answer / arr.length;
    }

}
