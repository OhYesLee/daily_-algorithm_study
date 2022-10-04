package ch01_20221004_2;

public class Solution {
    public static void main(String[] args) {
        int x[] = {1, 2, 3, 4, 5};
        GetMean getMean = new GetMean();
        // 아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("평균값1 : " + getMean.getMean(x));

        Solution2 solution2 = new Solution2();
        System.out.println("평균값2 : " + Solution2.solution2(x));


    }
}
