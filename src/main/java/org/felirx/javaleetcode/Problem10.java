package org.felirx.javaleetcode;

public class Problem10 {
  public static void RunProblem10() {
    Problem10 p = new Problem10();
    System.out.println(p.convert("PAYPALISHIRING", 3));
    p = new Problem10();
    System.out.println(p.convert("PAYPALISHIRING", 4));
    p = new Problem10();
    System.out.println(p.convert("A", 1));
    p = new Problem10();
    System.out.println(p.convert("AB", 1));
  }

  private int nRows;
  private String input;
  private int x;
  private Character[][] zigzag;

  public String convert(String s, int numRows) {
    x = 0;
    nRows = numRows;
    input = s;
    zigzag = new Character[input.length()][nRows];

    int i = 0;
    while (i < input.length()) {
      i = walkDown(i);
      if (i >= input.length()) {
        break;
      }
      i = walkRight(i);
    }

    StringBuilder out = new StringBuilder();
    for (int j = 0; j < nRows; j++) {
      for (i = 0; i < s.length(); i++) {
        if (zigzag[i][j] != null) {
          out.append(zigzag[i][j]);
        }
      }
    }
    return out.toString();
  }

  private int walkDown(int i) {
    int y = 0;
    while (y < nRows) {
      System.out.println(String.format("down %d, %d", x, y));
      zigzag[x][y] = input.charAt(i);
      i++;
      if (i >= input.length()) {
        return i;
      }
      y++;
    }
  
    return i;
  }

  private int walkRight(int i) {
    if (nRows <= 1) {
      x++;
      return i;
    }

    int y = nRows -1;

    while (y > 1) {
      x++;
      y--;
      zigzag[x][y] = input.charAt(i);
      i++;
      if (i >= input.length()) {
        break;
      }
    }
    x++;
    return i;
  }
}
