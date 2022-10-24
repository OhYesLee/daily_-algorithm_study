package ch04_02;

import java.util.ArrayList;
/*
위의 코드를 보면 문제의 정답을 맞힌 개수를 구하는 코드도 훨씬 간단하고 불필요한 배열이나 변수들이 없다.
나는 idx라는 변수 3개를 더 선언해 수포자들의 배열을 따로 돌렸는데 i%a.length 형식으로도 구할 수 있다는 걸 배웠다.
그리고 Math.max는 처음 봤다. 난수 생성할 때만 Math 클래스를 써봤는데 값의 크기를 비교해 큰 값을 반환하는 메서드가 있는 줄 몰랐다..!
마지막으로 stream().mapToInt는 조금 더 구글링해서 자세하게 알아봐야 할 것 같아서 포스팅으로 정리할 예정이다.
 */
public class solutionTwo_re {
    public int[] solution(int[] answer) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = new int[3];
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == a[i % a.length]) {
                score[0]++;
            }
            if (answer[i] == b[i % b.length]) {
                score[1]++;
            }
            if (answer[i] == c[i % c.length]) {
                score[2]++;
            }
        }
        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        ArrayList<Integer> list = new ArrayList<>();
        if (maxScore == score[0]) {
            list.add(1);
        }
        if (maxScore == score[1]) {
            list.add(2);
        }
        if (maxScore == score[2]) {
            list.add(3);
        }
        return list.stream().mapToInt(i -> i.intValue()).toArray();
    }
}
