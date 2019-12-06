package lesson24.warmup;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumbersPairs {
  public static void main(String[] args) {
    Map<Integer, Long> collect =
//    Map<Integer, List<Integer>> collect =
        Stream.generate(() -> (int) (Math.random() * 16 + 10)).limit(50)
//        .collect(Collectors.groupingBy((Integer x) -> x % 2));
        .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
    // printing

//    collect.forEach((key, value) -> System.out.printf("N:%d, C:%s\n", key, value));
    collect.forEach((key, value) -> System.out.printf("N:%d, C:%d\n", key, value));
    Integer number = collect.entrySet().stream()
        .min((o1, o2) -> (int) (o1.getValue() - o2.getValue()))
        .orElseThrow(() -> new IllegalArgumentException("there were no elements ;("))
        .getKey();
    System.out.printf("number is:%d\n", number);


  }
}
