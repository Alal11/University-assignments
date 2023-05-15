// Up & Down으로 숫자 추측하는 문제

import java.util.Random;
import java.util.Scanner;

public class No4_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("0 <= x < n 사이의 값을 뽑습니다. n 값을 입력하세요: ");
        n = sc.nextInt();

        Random rd = new Random(n);
        int random_num = (int) (Math.random() * n);

        int cnt = 0;
        boolean result = true;

        while (result) {
            System.out.println("정답을 추측하여 보세요: ");
            int num = sc.nextInt();
            cnt += 1;

            if (num > random_num) {
                System.out.println("제시한 정수가 정답보다 높습니다.");
            } else if (num < random_num) {
                System.out.println("제시한 정수가 정답보다 낮습니다.");
            } else {
                System.out.println("축하합니다. 정답: " + random_num + ", 시도횟수: " + cnt);
                result = false;
            }
        }
    }
}
