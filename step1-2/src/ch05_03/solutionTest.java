package ch05_03;
/////////[프로그래머스] 수박수박수박수박수박수?(JAVA)//////

/**
 * 문제 설명
 * 길이가 n이고, “수박수박수박수….”와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 예를들어 n이 4이면 “수박수박”을 리턴하고 3이라면 “수박수”를 리턴하면 됩니다.
 * 제한사항
 * n은 길이 10,000이하인 자연수입니다.
 * 입출력 예
 * n	return
 * 3	“수박수”
 * 4	“수박수박”
 */
public class solutionTest {
    public static void main(String[] args) {
        solutionOne solutionOne = new solutionOne();
//        int data = solutionOne.showSolutionOne();
//        System.out.println(data);
        System.out.println(solutionOne.solutionOne(3));


        solutionTwo two = new solutionTwo();

        System.out.println("n이 3인 경우: " + two.watermelon(3));
        System.out.println("n이 4인 경우: " + two.watermelon(4));
    }
}
