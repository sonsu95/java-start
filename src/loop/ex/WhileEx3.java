package loop.ex;

public class WhileEx3 {

  public static void main(String[] args) {
    int sum = 0;
    int count = 0;
    int max = 100;
    while (count < max) {
      count++;
      sum += count;
      System.out.println(sum);
    }
  }

}
