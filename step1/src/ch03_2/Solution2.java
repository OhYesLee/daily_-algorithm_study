package ch03_2;

public class Solution2 {
    public boolean solution2(int num) {

        String[] temp = String.valueOf(num).split("");

        int sum = 0;
        for (String s : temp) {
            sum += Integer.parseInt(s);
        }

        if (num % sum == 0) {
            return true;
        } else {
            return false;
        }

    }
}
