package ch08_3;

public class SolutionTwo {
    public String solutionTwo(String s) {
        String answer = ""; //반환할 답을 저장할 변수
        int s_lenght = s.length(); //String s의 길이를 변수에 저장
        //s의 길이를 2로 나눈 나머지가 0이면(s의길이가 짝수인 경우) -> (s의 길이/2)-1번째 문자부터 (s의 길이/2)번째 문자까지 answer에 저장
        //s의 길이가 홀수인 경우 -> s_lenght/2번째 문자를 answer에 저장
        answer = s_lenght % 2 == 0 ? s.substring((s_lenght / 2) - 1, (s_lenght / 2) + 1) : s.substring(s_lenght / 2, (s_lenght / 2) + 1);
        return answer; //답 반환
    }
}
