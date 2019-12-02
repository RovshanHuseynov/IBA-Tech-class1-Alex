package lesson22.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * https://upload.wikimedia.org/wikipedia/commons/thumb/e/e6/Merge_sort_algorithm_diagram.svg/300px-Merge_sort_algorithm_diagram.svg.png
 */
public class MergeSortWithLogger {

  private static final Logger log = LoggerFactory.getLogger(MergeSortWithLogger.class);

  void merge(int[] part, int idx_l, int idx_m, int idx_r) {
    log.debug(String.format(
        "MERGE: two arrays: %s and %s",
        Utils.arrToString(part, idx_l, idx_m),
        Utils.arrToString(part, idx_m + 1, idx_r)
    ));
    // calculating lengths
    int size_l = idx_m - idx_l + 1;
    int size_r = idx_r - idx_m;
    log.trace(String.format("calculated lengths are: l:%d r:%d", size_l, size_r));
    // allocate extra space for arrays
    int[] left = new int[size_l];
    int[] right = new int[size_r];

    // copy source arrays to allocated space
    for (int i=0; i < size_l; ++i) {
      left[i] = part[idx_l + i];
    }
    for (int j=0; j < size_r; ++j) {
      right[j] = part[idx_m + 1 + j];
    }

    // merge these parts to new one
    int i = 0, j = 0;
    // initial index of merged sub-array
    int k = idx_l;
    while (i < size_l && j < size_r) {
      if (left[i] <= right[j]) {
        part[k++] = left[i++];
      } else {
        part[k++] = right[j++];
      }
    }

    // copy residual elements from the left part
    while (i < size_l) {
      part[k++] = left[i++];
    }

    // copy residual elements from the right part
    while (j < size_r) {
      part[k++] = right[j++];
    }
    log.debug(String.format(" merged into: %s", Utils.arrToString(part, idx_l, idx_r)));
  }

  void sort(int[] data, int left, int right) {
    // left  - means index of the left part of array
    // right - means index of the right part of array
    log.info(String.format("SORT: within indexes: %d..%d, sub-array:%s", left, right,
        Utils.arrToString(data, left, right)));

    if (left < right) {
      int mid = (left + right) / 2;
      sort(data, left, mid);
      sort(data, mid + 1, right);
      merge(data, left, mid, right);
    }

    log.info(String.format("SORT: within indexes: %d..%d, sub-array:%s - finished", left, right,
        Utils.arrToString(data, left, right)));
  }

  public static void main(String[] args) {
    int[] data = Utils.create_random_data(8);
    int[] sorted = data.clone();
    MergeSortWithLogger app = new MergeSortWithLogger();
    app.sort(sorted, 0, data.length - 1);
//    System.out.println("Merge sort: complexity: O(n*log(N))");
  }

}
