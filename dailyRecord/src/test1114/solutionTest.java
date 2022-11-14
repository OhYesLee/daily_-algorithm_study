package test1114;

public class solutionTest {
    public static void main(String[] args) {
        String[] part = {"leo", "kiki", "eden"};
        String[] comp = {"eden", "kiki"};
        solution solution = new solution();
//        Solution sol = new Solution();
        System.out.println(solution.solution(part,comp));

        System.out.println("=============+");
        String[] part1 = {"leo", "kiki", "eden"};
        String[] comp1 = {"eden", "kiki"};
        solutionTwo sol = new solutionTwo();
        System.out.println(sol.solutiontwo(part1,comp1));

    }
}
