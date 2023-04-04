// 국적과 이름, 나이, 키를 입력받아 다움과 같이 출력하는 프로그램을 작성하시오
// 대한민국 홍길동 22 172.5를 입력한 경우 출력결과:
// 나의 국적은 대한민국이며 이름은 홍길동입니다
// 나이는 22살이며 키는 172.5 입니다

import java.util.Scanner;

public class No2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("국적 이름 나이 키를 입력 : ");
        String nationality = sc.next();
        String name = sc.next();
        String age = sc.next();
        String height = sc.next();

        System.out.printf("나의 국적은 %s이며 이름은 %s입니다\n", nationality, name);
        System.out.printf("나이는 %s이며 키는 %s 입니다.\n", age, height);
    }
}
