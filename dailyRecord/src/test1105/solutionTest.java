package test1105;

import java.util.Arrays;

public class solutionTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        String str1 = "1,2,3,4";
        solutionTwo solutionTwo = new solutionTwo();
//        System.out.println(Arrays.toString(solutionTwo.solutionTwo("1,2,3,4")));
//        System.out.println(solutionTwo.solutionTwo("1,2,3,4"));
        System.out.println(solutionTwo.solutionTwo(str));
        System.out.println("==========");


        String str = "1 2 3 4";
        solutionTwo_two minMax = new solutionTwo_two();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("최대값과 최소값은?" + minMax.getMinMaxString(str));

    }
}
