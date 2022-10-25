package ch05_03;

public class solutionOne {
    int n = 3;
    public String solutionOne(int n) {
        String answer = "";
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) answer += "수";
            else answer += "박";
        }
        return answer;
    }

    public int showSolutionOne(){
        return Integer.parseInt(solutionOne(3));
    }
}
