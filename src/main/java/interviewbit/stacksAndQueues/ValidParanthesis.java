package interviewbit.stacksAndQueues;

import java.util.ArrayDeque;

// https://www.interviewbit.com/problems/generate-all-parentheses/
public class ValidParanthesis {
  public int isValid(String s) {
    ArrayDeque<Character> stack = new ArrayDeque<>();
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
        stack.push(s.charAt(i));
      } else if (s.charAt(i) == '}') {
        if (stack.isEmpty() || stack.peek() != '{') {
          return 0;
        }
        stack.pop();
      } else if (s.charAt(i) == ')') {
        if (stack.isEmpty() || stack.peek() != '(') {
          return 0;
        }
        stack.pop();
      } else if (s.charAt(i) == ']') {
        if (stack.isEmpty() || stack.peek() != '[') {
          return 0;
        }
        stack.pop();
      }
    }
    if (stack.isEmpty()) {
      return 1;
    }
    return 0;

  }
}
