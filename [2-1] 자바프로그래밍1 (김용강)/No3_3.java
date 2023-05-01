// 계산기 프로그램 작성하기
// 1. 사용자로부터 하나의 문자와 두 개의 숫자를 입력 받음
// 2. 입력 받은 문자가 '+'이면 덧셈, '-'이면 뺄셈, '*'이면 곱셈, '/'이면 나눗셈
// 3. 나눗셈은 분모가 0이 아닌지 검사

import java.util.Scanner;

public class No3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("연산기호를 입력하세요: ");
        String giho = sc.next();

        System.out.println("숫자 2개를 입력하세요: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        switch (giho) {
            case "+":
                int sum = a + b;
                System.out.println(a + " + " + b + " = " + sum);
                break;

            case "-":
                int cha = a - b;
                System.out.println(a + " - " + b + " = " + cha);
                break;
            case "*":
                System.out.println(a + " * " + b + " = " + a * b);
                break;
            case "/":
                if (b == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    break;
                }
                double A = a;
                double B = b;
                System.out.println(A + " / " + B + " = " + A / B);
                break;
            default:
                System.out.println("ERROR!");
        }
    }
}
