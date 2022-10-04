package ch01_20221004_2;

import java.util.Arrays;

public class GetMean {
    public int getMean(int[] array) {
        return (int) Arrays.stream(array).average().orElse(0);
    }
}
