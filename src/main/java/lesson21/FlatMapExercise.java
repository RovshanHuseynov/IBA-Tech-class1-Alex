package lesson21;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExercise {
  public static void main(String[] args) {
    List<String> letters = Arrays.asList("A", "B", "C", "D");

    List<String> permutations =
        letters.stream().flatMap(l1 ->
            letters.stream()
                .filter(l2 -> !l1.equals(l2))
                .map(l2 -> l1 + l2)
        ).collect(Collectors.toList());

    System.out.println(permutations);
  }
}
