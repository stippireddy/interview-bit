package interviewbit.strings;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class PalindromeStringTest {

  @Test
  public void isPalindrome() {
    PalindromeString p = new PalindromeString();
    assertEquals(p.isPalindrome("A man, a plan, a canal: Panama"), 1);
    assertEquals(p.isPalindrome("race a car"), 0);
  }
}
