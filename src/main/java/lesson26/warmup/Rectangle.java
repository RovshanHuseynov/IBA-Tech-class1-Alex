package lesson26.warmup;

public class Rectangle {
  public final Point p1;
  public final Point p2;

  public static Rectangle rnd() {
    return new Rectangle(Point.rnd(), Point.rnd());
  }

  public Rectangle(Point p1, Point p2) {
    this.p1 = p1;
    this.p2 = p2;
  }

}
