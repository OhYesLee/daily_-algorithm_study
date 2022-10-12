package ch05_2;

/**
 * 등차수열의 합 공식
 * 해당 문제는 두 수를 1씩 증가하는 등차수열로 생각하고 생각하면 쉽다.
 * <p>
 * 등차수열 합 공식은 n *(첫째항 + 마지막 항) /2이다.
 * 문제에 적용시켜보면 | a-b | * ( a + b ) /2 하면 답이 나온다.
 */
public class Solution3 {
    public long solution3(int a, int b) {

        // Math.min(a,b) : a와 b중 작은 값, Math.max(a,b) : a와 b중 큰 값
        // 우선 sumAtoB라는 값 안에 a와 b의 대소 관계를 설정 한 후
        // (앞에가 작은 숫자, 뒤에가 큰 숫자),
        return sumAtoB(Math.min(a, b), Math.max(b, a));
    }

    // 리턴값 sumAtoB을 메소드로 받아 위에 나왔던 작은 값을 a에, 큰 값을 b에 부여한다.
    public long sumAtoB(long a, long b) {
        // 그렇게 새로 정의 된 a와 b를 등차수열의 합 공식을 이용하여
        // a와 b 사이의 합을 구한다.
        return (b - a + 1) * (a + b) / 2;
    }
}
