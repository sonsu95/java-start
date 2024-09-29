package scanner.ex;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ScannerEx4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("구구단의 단 수를 입력해주세요: ");
    int num = sc.nextInt();

    System.out.println(num + "단의 구구단: ");

    IntStream.rangeClosed(1, 9).forEach(i -> System.out.println(num + " * " + i + " = " + num * i));
  }

}
