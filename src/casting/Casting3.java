package casting;

public class Casting3 {

  public static void main(String[] args) {
    long maxIntValue = 2147483647; // int 최고값
    long maxIntOver = 2147483648L; // int 최고값 + 1;
    int intValue = 0;

    intValue = (int) maxIntValue; // 형변환
    System.out.println("maxIntValue casting = " + intValue);

    intValue = (int) 2147483648L; // 형변환
    System.out.println("maxIntOver casting = " + intValue); // -2147483648, 오버플로우 발생.
    // -> 시계가 한바퀴 돈 것처럼 다시 처음부터 시작
  }

}
