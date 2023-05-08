// 아래 시그마 식을 계산하는 프로그램

import java.util.Scanner;

public class No4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("M : ");
        int m = sc.nextInt();

        int r = 0;
        for (int i = 1; i <= m; i++) {
            r += (i * i) + 1;
        }
        System.out.println("R=" + r);
    }
}
