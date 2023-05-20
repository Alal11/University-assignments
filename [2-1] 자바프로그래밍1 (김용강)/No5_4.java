// 양수 5개를 입력 받아 배열에 저장하고 제일 큰 수를 출력하는 프로그램 작성

import java.util.Scanner;

public class No5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("양수 5개를 입력하세요.");
        int[] arr = new int[6];
        int max = 0;

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.printf("가장 큰 수는 %d 입니다.\n", max);
    }
}
