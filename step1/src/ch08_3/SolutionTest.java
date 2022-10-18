package ch08_3;

import java.util.Scanner;

public class SolutionTest {
    private static String abcde;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        SolutionTwo solutionTwo = new SolutionTwo();
        System.out.println(solutionTwo.solutionTwo(String.valueOf(s)));

    }

//
//    public SolutionTwo getSolutionTwo() {
//        return solutionTwo;
//    }


//    public void setSolutionTwo(SolutionTwo solutionTwo) {
//        this.solutionTwo = solutionTwo;
//    }
}
