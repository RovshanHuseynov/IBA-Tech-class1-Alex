package lesson19.warmup;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class StringsAdd {
  private static int digitAt(String s, int index) {
    return s.charAt(index)-'0';
  }

  public String add(String one, String two) {
    int idx1 = one.length()-1;
    int idx2 = two.length()-1;
    int carry = 0;
    LinkedList<Integer> r = new LinkedList<>();
    while (idx1>=0 && idx2>=0) {
      int d1 = digitAt(one, idx1--);
      int d2 = digitAt(two, idx2--);
      int d3 = d1 + d2 + carry;
      carry = d3 > 9 ? 1 : 0;
      r.addFirst(d3 % 10);
    }
    while (idx1>=0) {
      int d1 = digitAt(one, idx1--);
      int d3 = d1 + carry;
      carry = d3 > 9 ? 1 : 0;
      r.addFirst(d3 % 10);
    }
    while (idx2>=0) {
      int d2 = digitAt(two, idx2--);
      int d3 = d2 + carry;
      carry = d3 > 9 ? 1 : 0;
      r.addFirst(d3 % 10);
    }
    if (carry == 1) {
      r.addFirst(1);
    }
    return r.stream().map(Object::toString).collect(Collectors.joining());
  }

  public static void main(String[] args) {
    StringsAdd app = new StringsAdd();
    System.out.println(app.add("9999","2"));
  }

}
