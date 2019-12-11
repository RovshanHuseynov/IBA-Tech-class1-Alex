package lesson26.warmup;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RectanglesApp {
  public static void main(String[] args) {
    int size = Stream.generate(Rectangle::rnd)
        .limit(Fn.rnd())
        .flatMap(Rectangle::points)
        .collect(Collectors.toSet())
        .size();
  }
}
