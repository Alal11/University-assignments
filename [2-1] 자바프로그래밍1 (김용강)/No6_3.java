// 1부터 n까지의 홀수의 합을 구하는 프로그램과 짝수의 합을 구하는 프로그램을 두 개의 클래스(상속 관계)로
// 구성하여 작성하시오. 사용자로부터 숫자를 입력받아 짝수의 합과 홀수의 합을 출력하는 프로그램을 작성하시오.
// - 연습문제6.Odd 클래스: 1부터 n까지의 홀수의 합을 구하는 클래스 정의
// - 연습문제6.OddEven 클래스: 1부터 n까지의 짝수의 합을 구하는 클래스를 홀수를 구하는 클래스의 하위 클래스로 작성
// - OddEvenTest 클래스: 사용자로부터 입력된 값에 해당하는 짝수의 합, 홀수의 합을 출력하는 프로그램을 작성


import java.util.Scanner;

// 1부터 n까지 홀수의 합을 구하는 부모 클래스 연습문제6.Odd
class Odd {
    public int oddsum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i = i + 2) {
            sum = sum + i;
        }
        return sum;
    }
}

// 2부터 n까지 짝수의 합을 구하는 자식 클래스 연습문제6.OddEven
class OddEven extends Odd {
    public int evensum(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i = i + 2) {
            sum = sum + i;
        }
        return sum;
    }
}

public class No6_3 {// OddEvenTest

    public static void main(String[] args) {
        OddEven od = new OddEven();
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");
        int input = sc.nextInt();

        System.out.println("짝수의 합 : " + od.evensum(input));
        System.out.println("홀수의 합 : " + od.oddsum(input));
    }
}
