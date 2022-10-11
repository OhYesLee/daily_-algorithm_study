package Ch03;

public class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int yc = 0;
        int pc = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.toLowerCase().charAt(i) == 'y') yc++;
            else if (s.toLowerCase().charAt(i) == 'p') pc++;
        }

        if (yc != pc) answer = false;

        return answer;
    }
}
