package ch05_03;

/**
 * 간략하게 설명하면 char 빈 배열을 n/2+1 만큼 선언한다.
 * 그럼 빈 배열 안에는 초깃값인 \0이 들어 있을 테니 그 부분을 replace() 함수를 통해 “수박”으로 변경한다.
 * 그러고 나서 substring()으로 처음부터 n까지 잘라내어 리턴한다.
 */
public class solutionTwo {
    public String watermelon(int n) {

        return new String(new char[n / 2 + 1]).replace("\0", "수박").substring(0, n);
    }
}
