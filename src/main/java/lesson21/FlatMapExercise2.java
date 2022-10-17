package lesson21;

import java.util.Arrays;
import java.util.List;

public class FlatMapExercise2 {
    public static void main(String[] args) {
        List<Integer> letters = Arrays.asList(1, 2, 3, 4, 5);
        letters.forEach(i -> letters.forEach(j -> System.out.println(i + " " + j)));
    }
}
