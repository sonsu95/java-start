package operator;

public class Comp2 {

  public static void main(String[] args) {
    // NOTE: 문자열에 대한 비교를 진행할때는 동등연산자가 아닌 .equals()를 사용해야 한다.

    String str1 = "문자열1";
    String str2 = "문자열2";

    boolean result1 = "hello".equals("hello"); // 리터럴 비교
    boolean result2 = str1.equals("문자열1"); // 문자열 변수, 리터럴 비교
    boolean result3 = str1.equals(str2); // 문자열 변수 비교

    System.out.println("result1 = " + result1);
    System.out.println("result2 = " + result2);
    System.out.println("result3 = " + result3);

  }

}
