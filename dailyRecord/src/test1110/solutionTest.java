package test1110;

import java.util.Arrays;

public class solutionTest {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 4};
        int[] arr2 = {2, 2, 3, 3};
        int arr1 = 9;
        int arr3 = 10;
        solution solution = new solution();
        System.out.println(Arrays.toString(new int[]{solution.solution(arr, arr1)}));
        System.out.println(Arrays.toString(new int[]{solution.solution(arr2, arr3)}));

    }
}
