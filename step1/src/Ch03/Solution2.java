package Ch03;

/**
 * 람다식을 이용한 풀이법이다
 * 람다를 다시 공부하자
 */
public class Solution2 {
    boolean solution2(String s) {
        s = s.toUpperCase();

        return s.chars().filter(e -> 'P' == e).count() == s.chars().filter(e -> 'Y' == e).count();
    }
}
