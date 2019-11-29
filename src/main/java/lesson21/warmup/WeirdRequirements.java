package lesson21.warmup;

public class WeirdRequirements {
  public int[] generate(final int n) {
    int[] ints = new int[n];

//    step 1
//    int v;
//    if (n%2!=0) {
//      v = n/2;
//    } else {
//      v = n/2 - 1;
//    }

//    step 2
//    int v = n%2!=0 ? n/2 : n/2 - 1;

//    step 3
//    int v = n/2;
//    if (n%2==0) v--;

//    step 4
    int v = n/2 - 1 + n % 2;
    for (int i = 0; i < n / 2; i++, v--) {
      ints[i] = v;
      ints[n-1-i] = v;
    }
    return ints;
  }
}
