package interviewbit.arrays;

import java.util.ArrayList;
import java.util.List;

// https://www.interviewbit.com/problems/repeat-and-missing-number-array/
public class RepeatAndMissingNumber {
  public ArrayList<Integer> repeatedNumber(final List<Integer> a) {
    int xor = 0;
    for (int i = 1; i <= a.size(); i++) {
      xor ^= a.get(i - 1);
      xor ^= i;
    }
    int rightMostSetBit = xor & ~(xor - 1);
    int x = 0, y = 0;
    for (int i = 1; i <= a.size(); i++) {
      if ((i & rightMostSetBit) != 0) {
        x ^= i;
      } else {
        y ^= i;
      }
      if ((a.get(i - 1) & rightMostSetBit) != 0) {
        x ^= a.get(i - 1);
      } else {
        y ^= a.get(i - 1);
      }
    }
    ArrayList<Integer> result = new ArrayList<>();
    for (int i = 1; i <= a.size(); i++) {
      if (a.get(i - 1) == x) {
        result.add(x);
        result.add(y);
        return result;
      }
      if (a.get(i - 1) == y) {
        result.add(y);
        result.add(x);
        return result;
      }
    }
    return null;
  }
}
