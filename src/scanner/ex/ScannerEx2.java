package scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("하나의 정수를 입력하세요: ");
    int num = sc.nextInt();

    String str = num % 2 == 1 ? "홀수" : "짝수";

    System.out.print("입력한 숫자 " + num + "은(는) " + str + "입니다.");
  }

}
