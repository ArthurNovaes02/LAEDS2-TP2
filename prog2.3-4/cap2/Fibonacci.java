package cap2;
public class Fibonacci {
  public static int fibRec (int n) {
    if (n < 2) return n;
    else return (fibRec (n-1) + fibRec (n-2));
  }

  public static int fibIter (int n) {
    int i = 1, f = 0;
    for (int k = 1; k <= n; k++) {
      f = i + f;
      i = f - i;
    }
    return f;
  }

  public static void main (String[] args) {
    System.out.println ("fibRec(10) = " + fibRec (10));
    System.out.println ("fibIter(10) = " + fibIter (10));
  }
}
