package scanner.ex;

import java.util.Scanner;
import java.util.StringJoiner;
import java.util.stream.IntStream;

public class ScannerEx5 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int temp = 0;

    System.out.print("첫 번째 숫자를 입력하세요: ");
    int num1 = sc.nextInt();
    System.out.print("두 번째 숫자를 입력하세요: ");
    int num2 = sc.nextInt();

    if (num1 > num2) {
      temp = num1;
      num1 = num2;
      num2 = temp;
    }

    StringJoiner joiner = new StringJoiner(", ");
    IntStream.rangeClosed(num1, num2).forEach(i -> joiner.add(String.valueOf(i)));

    System.out.print("두 숫자 사이의 모든 정수: " + joiner);
  }

}
