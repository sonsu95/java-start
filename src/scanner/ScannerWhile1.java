package scanner;

import java.util.Scanner;

public class ScannerWhile1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.print("문자열을 입력하세요(exit: 종료): ");
      String inputStr = sc.next();
      if (inputStr.equals("exit")) {
        System.out.println("프로그램을 종료합니다.");
        break;
      } else {
        System.out.println(inputStr);
      }
    }

  }

}
