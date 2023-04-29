// 요일 입력 시 주중/주말 나눠서 출력하는 프로그램 작성하기
// 1. switch문 이용

import java.util.Scanner;

public class No3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("요일을 입력하세요: ");
        String word = sc.next();

        switch (word) {
            case "MON":
            case "TUE":
            case "WED":
            case "THU":
            case "FRI":
                System.out.println("주중");
                break;
            case "SAT":
            case "SUN":
                System.out.println("주말");
                break;
            default:
                System.out.println("error!");
        }
    }
}
