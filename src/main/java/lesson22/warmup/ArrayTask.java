package lesson22.warmup;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayTask {

  public static int[][] data() {
    return new int[][]{{1,6,3}, {}, {5,4}, {7,8,2,9}, {}};
  }

  public static void main(String[] args) {
    Stream<int[]> step1 = Arrays.stream(data());
    Stream<Integer> step2 = step1
        .flatMap(new Function<int[], Stream<Integer>>() {
          @Override
          public Stream<Integer> apply(int[] ints) {
            IntStream stream = Arrays.stream(ints);
            Stream<Integer> boxed = stream.boxed();
            return boxed;
          }
        });
    //.sorted();
    IntStream step3 = step2.mapToInt(x -> x);
    step3.sorted().forEach(x -> System.out.print(x + " "));
//
//    IntSummaryStatistics st = step3.summaryStatistics();
//    st.getMax();
//    st.getMin();
//    st.getCount();
//    st.getAverage();
//    st.getSum();
  }
}
