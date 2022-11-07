package test1107;

import java.util.Scanner;

public class solutionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int cnt = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                cnt++;
                if (cnt == k) {
                    System.out.println(i);
                    break;
                }
            }
        }
        if (cnt < k) System.out.println("0");

        int [] arr = {1, 5, 2, 6, 3, 7, 4};
//        int [][] arr2 = {(2, 5, 3), (4, 4, 1), (1, 7, 3)};
        solution solution = new solution();
//        System.out.println(solution.solution());
    }
}
