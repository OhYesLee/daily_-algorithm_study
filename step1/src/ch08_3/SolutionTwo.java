package ch08_3;
/////////가운데 글자 가져오기/////////
/**
 * 문제 설명
 *
 * 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
 *
 * 재한사항
 * s는 길이가 1 이상, 100이하인 스트링입니다.
 * 입출력 예
 * s	return
 * "abcde"	"c"
 * "qwer"	"we"
 */
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
