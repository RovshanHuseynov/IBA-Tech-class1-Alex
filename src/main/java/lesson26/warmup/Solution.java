package lesson26.warmup;

import java.util.stream.Stream;

public class Solution {
  public static void main(String[] args) {
    Stream<Rectangle> data = Stream.generate(Rectangle::rnd).limit(Fn.rnd());
    // ...
    // your code must be there
    // ...
  }
}
