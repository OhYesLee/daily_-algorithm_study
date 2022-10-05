package ch02_3;

public class Solution2 {
    public int[] solution(long n) {
        String num = n + "";
        char[] numArr = num.toCharArray();
        int[] answer = new int[numArr.length];
        int idx = 0;
        for(int i = numArr.length-1; i >=0; i--){
            answer[idx++] = numArr[i] -'0';
        }
        return answer;
    }
}
