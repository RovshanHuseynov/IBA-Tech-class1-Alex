package lesson23.warmup;

import java.util.stream.Collectors;

public class GetRidOfDuplicates {
  public static void main(String[] args) {
    String filtered =
        "abcdeeff".chars()
        .distinct()
        .mapToObj(v -> String.valueOf((char)v))
        .collect(Collectors.joining());
    System.out.println(filtered);
  }
}
