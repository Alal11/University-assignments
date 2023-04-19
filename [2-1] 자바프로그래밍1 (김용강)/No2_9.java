// 프로그램 실행 시 돈의 금액을 입력 받아 금액에 해당되는 돈을 종류별로 나타내는 프로그램
// 돈은 만원, 천원, 오백원, 백원, 십원, 일원 단위만 있다고 가정한다.
// 입력값: 금액
// 출력값: 금액에 따른 돈을 종류별로 표시

import java.util.Scanner;

public class No2_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cost, num = 0;
        int a, b, c, d, e, f;

        System.out.println("금액을 입력하세요 : ");
        cost = sc.nextInt();

        a = cost / 10000;
        b = (cost % 10000) / 1000;
        c = (cost % 10000 % 1000) / 500;
        d = (cost % 10000 % 1000 % 500) / 100;
        e = (cost % 10000 % 1000 % 500 % 100) / 10;
        f = (cost % 10000 % 1000 % 500 % 100 % 10);

        System.out.println("일만원권 : " + a + "장");
        System.out.println("천원권 : " + b + "장");
        System.out.println("오백원주화 : " + c + "개");
        System.out.println("백원주화 : " + d + "개");
        System.out.println("십원주화 : " + e + "개");
        System.out.println("일월주화 : " + f + "개");
    }
}
