// 배열의 length 필드를 이용하여 배열 크기만큼 정수를 입력 받고 평균을 출력

import java.util.Scanner;

public class No5_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("배열 크기를 입력하세요.");
        int size = sc.nextInt();

        float sum = 0;
        System.out.printf("%d 개의 정수를 입력하세요.", size);
        for (int i = 0; i < size; i++) {
            int num = sc.nextInt();
            sum += num;
        }
        System.out.printf("평균은 %.2f 입니다.\n", sum / size);
    }
}
