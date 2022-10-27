package read2;

public class solutionTest {
    public static void main(String[] args) {
        solution sol = new solution();
        int[] priorities = { 2, 1, 3, 2 };
        System.out.print(sol.solution(priorities, 2));

        System.out.println("==========");
        solutionTwo solutionTwo = new solutionTwo();
        int[] priorities1 = { 2, 1, 3, 2 };
        System.out.print(solutionTwo.solution(priorities1,2));
    }
}
