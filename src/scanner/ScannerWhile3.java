package scanner;

import java.util.Scanner;

public class ScannerWhile3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sum = 0;

    while (true) {

      System.out.print("정수를 입력하세요(0입력시 종료): ");
      int inputNum = sc.nextInt();
      sum += inputNum;

      if (inputNum == 0) {
        break;
      }

      System.out.println("입력한 모든 정수 합: " + sum);
    }
  }

}
