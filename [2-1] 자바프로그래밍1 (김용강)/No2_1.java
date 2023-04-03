// 두 개의 정수를 입력 받아 첫 번째 수에서 두 번째 수를 뺀 결과를 출력하는 프로그램
// 숫자를 입력: 20과 10을 입력한 경우 출력 결과:
// 20-10의 결과는 10입니다.

import java.util.Scanner;

public class No2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력 : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.printf("%d-%d의 결과는 %d입니다\n", n1, n2, n1 - n2);
    }
}
