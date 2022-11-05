package test1105;

public class solutionTwo_two {
    public String getMinMaxString(String str) {
        String[] tmp = str.split(" ");
        int min, max, n;
        min = max = Integer.parseInt(tmp[0]);
        for (int i = 1; i < tmp.length; i++) {
            n = Integer.parseInt(tmp[i]);
            if (min > n) min = n;
            if (max < n) max = n;
        }

        return min + " " + max;
    }
}
