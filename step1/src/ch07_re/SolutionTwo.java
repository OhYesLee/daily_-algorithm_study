package ch07_re;

import java.util.Arrays;

public class SolutionTwo {
    public int[] solutiontwo(int[] arr, int divisor) {
        int count = 0; //배열의 값들중 divisor로 나누었을때 나머지가 0인 개수를 저장할 변수
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) //배열의 값들중 divisor로 나누었을때 나머지가 0이면
            {
                count++; //count를 증가
            }
        }
        if (count == 0) //count가 0이면 (divisor로 나누었을때 나머지가 0인 숫자가 없었을경우)
        {
            int answer[] = {-1}; //answer에 -1을 저장
            return answer; //답 반환
        }

        int[] answer = new int[count]; //답을 반환할 배열 선언

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) //배열의 값들중 divisor로 나누었을때 나머지가 0이면
            {
                answer[j] = arr[i]; //배열에 나머지가 0이되는 값들을 저장
                j++; //j의 값을 증가시켜줌
            }
        }
        Arrays.sort(answer); //답을 오름차순으로 정렬
        return answer;
    }
}
