package cond.ex;

public class ExchangeRateEx {

  public static void main(String[] args) {
    // 환율 계산하기

    int dollar = 3;
    int EXCHANGE_RATE_DOLLAR_PRICE = 1300;

    if (dollar < 0) {
      System.out.println("잘못된 금액입니다");
    } else if (dollar == 0) {
      System.out.println("환전할 금액이 없습니다");
    } else {
      System.out.println("환전 금액은 " + EXCHANGE_RATE_DOLLAR_PRICE * dollar + "원입니다.");
    }
  }

}
