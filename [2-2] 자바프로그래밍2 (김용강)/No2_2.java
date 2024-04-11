package 연습문제2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class No2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String result1 = "y";

        while (result1.equals("y")) {
            int answer = (int) (Math.random() * 100);
            int low = 0, high = 99;
            int round = 1;

            System.out.println("Random number is generated. Guess the number:");

            while (true) {
                System.out.println(low + "-" + high);  // 값의 범위 출력
                System.out.print(round + ">> ");  // 시행 횟수 출력
                int num;

                try {
                    num = sc.nextInt();  // 수를 입력받는다.

                } catch (InputMismatchException e) {  // 키 입력을 정수로 변환하지 못하는 예외 처리
                    System.out.println("Only integer is allowed.");
                    sc.nextLine();  //나머지 모든 키를 읽어서 버린다.
                    continue;  // 다시 시도한다.
                }

                if (num > high || num < low) {  // high와 low의 범위를 벗어난 경우
                    System.out.println("Out of bounds.");
                } else {  // 정상적인 범위의 수가 입력된 경우
                    if (num < answer) {  // 입력된 값이 정답보다 낮은 범위의 수인 경우
                        System.out.println("Enter a larger number.");
                        low = num;
                    } else if (num > answer) {  // 입력된 값이 정답보다 높은 범위의 수인 경우
                        System.out.println("Enter a small number.");
                        high = num;
                    } else {  // 정답인 경우
                        System.out.println("Correct.");
                        break;  // while 문 종료
                    }
                }
                round++;  // 시행 횟수 증가
            }
            System.out.print("Tray again? (y/n)>> ");
            result1 = sc.next();
            if (result1.equals("n")) {
                System.out.println("end.");
            }
        }
    }
}
