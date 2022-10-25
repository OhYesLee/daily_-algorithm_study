package sh05_02;

public class solutionOne {
    public long solution(int a, int b) {
        long answer = 0;
        if (a > b) //a가 b보다 큰 경우
        {
            while (a > b) //a가 b보다 큰 경우 반복
            {
                answer = b + answer; //answer에 값을 더함
                b++;
            }
            answer = b + answer; //a와 b가 같은경우 위 while이 반복되지 않으므로 따로 더해줌
        } else if (b > a) //b가 a보다 큰 경우
        {
            while (a < b) //b가 a보다 큰 경우 반복
            {
                answer = a + answer; //answer에 값을 더함
                a++;
            }
            answer = a + answer; //a와 b가 같은경우 위 while이 반복되지 않으므로 따로 더해줌
        } else //a와 b가 같은경우
        {
            answer = a; //a
        }
        return answer;
    }
}
