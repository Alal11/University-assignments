// 두 개의 수를 입력 받아 큰 수를 출력하는 프로그램 작성
//  - public static void main(String args[]){...}
//  - public static int max(int num1, int num2){...}

import java.util.Scanner;

public class No10_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("두개의 숫자를 공백 기준으로 입력하시오: ");
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.printf("두 수 중 큰 값은 (%d,%d) : %d\n", a,b,max(a,b));
    }

    public static int max(int num1, int num2){
        if(num1>num2)
        {
            return num1;
        }
        else return num2;
    }
}
