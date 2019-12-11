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

  public int left() {
    return Math.min(p1.x, p2.x);
  }

  public int right() {
    return Math.max(p1.x, p2.x);
  }

  public int top() {
    return Math.min(p1.y, p2.y);
  }

  public int down() {
    return Math.max(p1.y, p2.y);
  }

}
