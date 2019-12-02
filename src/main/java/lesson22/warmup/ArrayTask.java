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
    IntStream data = Stream.of(data())  // Stream<int[]>
        .flatMap((int[] ints) -> Arrays.stream(ints).boxed())
        .mapToInt(x -> x)
        .sorted();

    IntSummaryStatistics st = data.summaryStatistics();
    st.getMax();
    st.getMin();
    st.getCount();
    st.getAverage();
    st.getSum();
  }
}
