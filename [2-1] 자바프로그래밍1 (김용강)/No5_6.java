// '월', '화', '수', '목', '금', '토', '일' 로 초기화된 문자 배열을 선언하고,
// 사용자로부터 정수를 입력받아 7로 나눈 나머지를 인덱스로 하며 배열 day에 저장된 문자를 출력.
// 음수가 입력되면 프로그램 종료.

import java.util.Scanner;

public class No5_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] day = {'월', '화', '수', '목', '금', '토', '일'};

        while (true) {
            System.out.println("정수를 입력하세요>> ");
            int num = sc.nextInt();

            if (num == -1) {
                System.out.println("프로그램 종료합니다...");
                break;
            }
            int index = (num - 1) % day.length;

            System.out.println(day[index]);
        }
    }
}
