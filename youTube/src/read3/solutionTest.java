package read3;

public class solutionTest {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};
        System.out.print(sol.solution(5, lost, reserve));
        System.out.println();
        System.out.println("==================");
        SolutionTwo sol2 = new SolutionTwo();
        int[] lost2 = {2, 4};
        int[] reserve2 = {1, 3, 5};
        System.out.print(sol2.solution(5, lost2, reserve2));
        System.out.println();
    }
}
