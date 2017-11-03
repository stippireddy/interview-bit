package interviewbit.strings;

public class MinimumCharactersToMakePalindromic {
  public int solve(String input) {
    StringBuffer sb = new StringBuffer(input);
    sb.reverse();
    String s = sb.toString() + "$" + input;
    int[] lps = generateLPS(s);
    return input.length() - lps[s.length() - 1];
  }

  public int[] generateLPS(String s) {
    int[] lps = new int[s.length()];
    int i = 1, j = 0;
    while (i < s.length()) {
      if (s.charAt(i) == s.charAt(j)) {
        lps[i] = j + 1;
        i++;
        j++;
      } else {
        if (j == 0) {
          lps[i] = 0;
          i++;
        } else {
          j = lps[j - 1];
        }
      }
    }
    return lps;
  }
}
