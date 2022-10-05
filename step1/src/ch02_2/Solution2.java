package ch02_2;
/**
 * 제곱근이라는 단어를 봤을 때 예전에 사용했었던 Math.sqrt() 메서드가 떠올랐다.
 * Math.sqrt() 메서드는 반환값이 double 타입으로 반환되어서 메서드 앞에 (long)을 붙여주어 형 변환을 해 answer 변수에 담았다.
 * 그리고 answer * answer 했을 때 매개 변수로 주어지는 n 값과 같으면 (answer + 1)의 제곱을 리턴하고,
 * n과 값이 다르면 -1을 리턴하는 코드를 작성했다.
 */
public class Solution2 {
    public long solution2(long n) {
        long answer = (long)Math.sqrt(n);
        if(answer * answer == n) answer = (answer+=1) * answer;
        else answer = -1;
        return answer;

    }
}

