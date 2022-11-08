package nz.ac.auckland.demo;

public class Math {

  public static int add(int n1, int n2){
    return n1 + n2;
  }

  public static int multiply(int n1, int n2){
    return n1 * n2;
  }

  public static int abs(int x){
    if (x >= 0){
      return x;
    }
    return x * -1;
  }

  public static int max(int n1, int n2){
    if (n1 > n2){
      return  n1;
    }
    return n2;
  }
}
