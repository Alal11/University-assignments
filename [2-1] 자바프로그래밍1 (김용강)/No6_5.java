// - 날짜를 나타내는 클래스 연습문제6.Date 생성
//      - 연도, 월, 일 의 속성을 가짐.
//      - 연/월/일 을 입력 받아 객체 생성.
//      - 생성된 객체를 아래와 같이 두 방법으로 프린트
//          - print1() : 날짜를 "2022.8.15"와 같이 출력
//          - print2() : 날짜를 "8 15, 2022"와 같이 출력

import java.util.Scanner;

class Date {
    int year;
    int month;
    int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void print1() {
        System.out.println(year + "." + month + "." + day);
    }

    public void print2() {
        System.out.println(month + " " + day + ", " + year);
    }
}

public class No6_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("연일을 입력하세요: ");

        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        Date d12 = new Date(y, m, d);
        d12.print1();
        d12.print2();
    }
}
