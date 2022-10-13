package ch06;

/**
 * phone_number의 길이만큼 반복문을 돌리고, 그 길이에서 4를 뺀 수보다 작으면 *을, 4를 뺀 수보다 크면 해당 핸드폰 번호를 붙여준다.
 */
public class SolutionThree {
    public String solutionthree(String phone_number) {
        String answer = "";

        for (int i = 0; i < phone_number.length(); i++) {
            if (i >= phone_number.length() - 4)
                answer += Character.toString(phone_number.charAt(i));
            else {
                if (i == 0) answer = "*";
                else answer += "*";
            }
        }

        return answer;
    }
}
