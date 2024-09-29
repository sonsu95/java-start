package scanner.ex;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ScannerWhileEx3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요: ");

    // IntStream을 사용하여 입력을 수집하고, 합계와 평균을 계산
    int[] numbers = IntStream.generate(sc::nextInt)
        .takeWhile(input -> input != -1)
        .toArray();

    // 합계 계산
    int sum = IntStream.of(numbers).sum();

    // 평균 계산
    double avg = IntStream.of(numbers).average().orElse(0.0);

    System.out.println("입력한 숫자들의 합계: " + sum);
    System.out.println("입력한 숫자들의 평균: " + avg);
  }
}