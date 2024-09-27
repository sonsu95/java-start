package casting;

public class Casting1 {

  // 작은 범위에서 큰 범위로 대입하는건 허용
  // 묵시적 형변환 (자동 형변환)
  public static void main(String[] args) {
    int intValue = 10;
    long longValue;
    double doubleValue;

    longValue = (long) intValue; // int -> long
    System.out.println("longValue = " + longValue);

    doubleValue = (double) intValue; // int -> double
    System.out.println("doubleValue = " + doubleValue);

    doubleValue = (double) 20L; // long -> double
    System.out.println("doubleValue2 = " + doubleValue);
  }

}
