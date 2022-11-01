package test1101;

/**
 * Split이란?
 * Split은 구분자를 기준으로 문자열을 잘라 배열로 입력할 때 사용하는 메서드입니다
 * Split의 사용방법에는
 * split(String regex);
 * -> 구분자를 바탕으로 배열 형식으로 문자열을 잘라줍니다
 * split(String regex, int limit);
 * -> 위와 마찬가지로 구분자를 바탕으로 배열 형식으로 문자열을 자르지만 limit 수만큼 잘라줍니다
 */
public class solutionTwo {
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
