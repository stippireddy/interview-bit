package interviewbit.strings;

// https://www.interviewbit.com/problems/palindrome-string/
public class PalindromeString {
  public int isPalindrome(String s) {
    int left = 0, right = s.length() - 1;
    while (left < right) {
      if (!Character.isLetterOrDigit(s.charAt(left))) {
        left++;
      } else if (!Character.isLetterOrDigit(s.charAt(right))) {
        right--;
      } else {
        if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
          return 0;
        }
        left++;
        right--;
      }
    }
    return 1;
  }
}
