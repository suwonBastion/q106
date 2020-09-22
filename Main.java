import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    System.out.print("실수값:");
    double n = stdin.nextDouble();
    System.out.println("절대값:"+(n<0 ? -n : n));
    System.out.println("제곱근:"+Math.sqrt(n));
    System.out.println("실수값:"+(Math.PI*x*x));
  }
}