// 구입한 상품의 가격과 손님한테 받은 금액을 입력하면
// 부가세와 거스름돈을 출력하는 프로그램 작성 (상품 가격에 부가세 포함)

import java.util.Scanner;

public class No2_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int money, price, result;

        System.out.println("받은 돈: ");
        money = sc.nextInt();

        System.out.println("상품 가격: ");
        price = sc.nextInt();

        result = money - price;

        System.out.println("부가세: " + price / 10);
        System.out.println("잔돈: " + result);
    }
}
