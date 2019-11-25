package lesson19.warmup;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class SNumber {
  private int digitAt(String s, int index) {
    return s.charAt(index) - '0';
  }

  public String add(String v1, String v2) {
    LinkedList<Integer> digits = new LinkedList<>();
    int idx1 = v1.length() - 1;
    int idx2 = v2.length() - 1;
    int carry = 0;
    while (idx1>=0 && idx2>=0) {
      int d = digitAt(v1, idx1--) + digitAt(v2, idx2--) + carry;
      carry = d / 10;
      d = d % 10;
      digits.addFirst(d);
    }
    while (idx1>=0) {
      int d = digitAt(v1, idx1--) + carry;
      carry = d / 10;
      d = d % 10;
      digits.addFirst(d);
    }
    while (idx2>=0) {
      int d = digitAt(v2, idx2--) + carry;
      carry = d / 10;
      d = d % 10;
      digits.addFirst(d);
    }
    if (carry != 0) digits.addFirst(1);
    return digits.stream()             // Stream<Integer>
        .map(v -> Integer.toString(v)) // Stream<String>
        .collect(Collectors.joining());// String
  }
}
