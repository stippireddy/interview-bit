package interviewbit.arrays;

// https://www.interviewbit.com/problems/first-missing-integer/
public class FirstMissingNumber {
  public int firstMissingPositive(int[] input) {
    for (int i = 0; i < input.length; i++) {
      while (input[i] > 0 && input[i] < input.length && input[i] != i + 1
          && input[input[i] - 1] != input[i]) {
        int temp = input[i];
        input[i] = input[temp - 1];
        input[temp - 1] = temp;
      }
    }
    for (int i = 0; i < input.length; i++) {
      if (input[i] != i + 1) {
        return i + 1;
      }
    }
    return input.length + 1;
  }
}
