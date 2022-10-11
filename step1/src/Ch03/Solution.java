package Ch03;
/*
이번 문제는 toLowerCase() 메서드 덕분에 조금 버벅거렸지만 그래도 저번 문제보다는 엄~청 쉬운 편이었다.
일단 y와 p의 개수를 세는 변수 두 개를 선언하고, for문을 s 문자열의 길이만큼 돌리면서 s 문자열의 모든 알파벳을 toLowerCase()로 소문자를 만들고,
y와 p를 찾으면 각각의 카운트 변수에 +1을 증가시켰다.
그리고 마지막으로 for문을 빠져나와 y의 개수와 p의 개수가 같지 않으면 answer에 false 값을 넣어 리턴했다.
 */
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
