package scanner;

import java.util.Scanner;

public class ScannerWhile2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("첫 번째와 두 번째 숫자 모두 0을 입력하면 프로그램을 종료합니다.");

    while (true) {

      System.out.print("첫 번째 숫자를 입력하세요: ");
      int inputNum1 = sc.nextInt();
      System.out.print("두 번째 숫자를 입력하세요: ");
      int inputNum2 = sc.nextInt();

      if (inputNum1 == 0 && inputNum2 == 0) {
        System.out.println("프로그램 종료");
        break;
      }

      System.out.println("두 숫자의 합: " + (inputNum1 + inputNum2));
    }
  }

}
