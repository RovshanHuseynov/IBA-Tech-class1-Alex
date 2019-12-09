package lesson25.warmup;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumbersThrees {
  public static void main(String[] args) {
    Stream.generate(() -> (int) (Math.random() * 51 - 26)).limit(50)
        .sorted()
        .collect(Collectors.groupingBy(i -> {
              if (i > 10) return 1;
              if (i <-10) return -1;
              return 0;
            }
        ))
        .forEach((Integer k, List<Integer> v) ->
            System.out.printf("%s: %s\n",
                k == 1 ? "gt" : k == -1 ? "lt" : "rs",
                v));
  }
}
