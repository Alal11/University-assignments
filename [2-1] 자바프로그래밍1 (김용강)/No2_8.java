// 정수 (0~127) 까지의 숫자를 입력 받아서 2진수로 변환하여 출력하는 프로그램
// "/" 연산자와 "%" 연산자를 사용하여 작성

import java.util.Scanner;

public class No2_8 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("정수: ");
        n = sc.nextInt();
        int[] b = new int[32];

        System.out.printf("%d: ", n);

        // 소수 구하는 아래 과정 엄청 중요함
        int i = 0;
        while (n != 1) {
            b[i++] = n % 2;
            n = n / 2;
        }
        b[i] = n;

        for (int j = i; j >= 0; --j) {
            System.out.print(b[j]);
        }
    }
}
