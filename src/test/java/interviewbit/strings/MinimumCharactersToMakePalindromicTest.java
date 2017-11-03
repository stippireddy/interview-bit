package interviewbit.strings;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class MinimumCharactersToMakePalindromicTest {

  @Test
  public void solve() {
    MinimumCharactersToMakePalindromic m = new MinimumCharactersToMakePalindromic();
    assertEquals(m.solve("banana"), 5);
    assertEquals(m.solve("AACECAAAA"), 2);
    assertEquals(m.solve("ABC"), 2);
    assertEquals(m.solve("mmtatbdzqsoemuvnpppsu"), 19);
  }
}
