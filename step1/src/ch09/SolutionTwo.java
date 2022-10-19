package ch09;

public class SolutionTwo {
    String getMiddle(String word) {

        return word.substring((word.length() - 1) / 2, word.length() / 2 + 1);
    }
}
