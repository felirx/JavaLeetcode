package org.felirx.javaleetcode;

public class Problem9 {
  public static void RunProblem9() {
    System.out.println(String.format("x = 121 %s", Problem9 .isPalindrome(121)));
    System.out.println(String.format("x = -121 %s", Problem9 .isPalindrome(-121)));
    System.out.println(String.format("x = 10 %s", Problem9 .isPalindrome(10)));
  }

  public static boolean isPalindrome(int x) {
    return stringSolution(x);
  }

  private static boolean stringSolution(int x) {
    String candidate = String.valueOf(x);

    return isPalindrome(candidate);
  }

  private static boolean isPalindrome(String s) {
    int l = 0, r = s.length() -1;
    while (l <= r) {
      if (s.charAt(l) != s.charAt(r)) {
        return false;
      }
      l++;
      r--;
    }
    return true;
  }
}
