package lesson26.warmup;

public class Fn {

  public static int rnd() {
    return rnd(20);
  }

  public static int rnd(int max) {
    return (int)(Math.random()*(max+1));
  }

}
