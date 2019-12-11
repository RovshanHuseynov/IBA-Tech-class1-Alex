package lesson26.warmup;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Point {
  public final int x;
  public final int y;

  public static Point rnd() {
    return new Point(Fn.rnd(), Fn.rnd());
  }

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Point)) return false;
    Point that = (Point) o;
    return (this.x == that.x) && (this.y == that.y);
  }

  @Override
  public int hashCode() {
    return x << 16 + y;
  }
}
