// 1~6 범위를 갖는 두 숫자의 합이 6이 되는 경우를 출력하는 프로그램

import java.util.Scanner;

public class No4_3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i + j == 6) {
                    System.out.printf("(%d,%d)\n", i, j);
                }
            }
        }
    }
}
