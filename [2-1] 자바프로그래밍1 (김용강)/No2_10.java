// 섭씨 온도(C)와 화씨 온도(F) 관계는 다음과 같음: C = 5/9*(F-32)
// 사용자로부터 값을 입력받아 F -> C 혹은 C -> F로 변환하는 프로그램을 작성
// "교재 5-5 3항 연산자"를 참조하여 F -> C 혹은 C -> F를 선택하여 변환하도록 작성
// 입력: F -> C 혹은 C -> F 선택, 온도

import java.util.Scanner;

public class No2_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("======================");
        System.out.println("1. 화씨->섭씨\n2. 섭씨->화씨");
        System.out.println("======================");

        System.out.print("번호를 선택하시오: ");
        int num = sc.nextInt();
        System.out.print("온도를 입력하시오: ");
        int temp = sc.nextInt();

        float re_temp;
        switch (num) {
            case 1:
                re_temp = (float) 5 / 9 * (temp - 32);
                break;
            case 2:
                re_temp = (float) 9 / 5 * temp + 32;
                break;
            default:
                System.out.println("ERROR!");
                return;
        }
        System.out.printf("변환된 온도는 %.1f", re_temp);
    }
}
