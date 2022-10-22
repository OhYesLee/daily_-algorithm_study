package ch10_re;

import java.util.Arrays;
import java.util.Scanner;

public class SolutionTestTwo {
    public static void main(String[] args) {
        int[] win = {1, 2, 3, 4, 5, 6};
        int[] lot = {1, 2, 3, 4, 5, 6};
        SolutionTwo solutionTwo = new SolutionTwo();
        Scanner sc = new Scanner(System.in);
        System.out.println(Arrays.toString(solutionTwo.solutiontwo(lot, win)));
    }
}
