// 가위, 바위, 보 게임 작성하는 문제
// 1. 가위, 바위, 보를 임의의 숫자로 지정 후,  random number를 생성하여 비교
// 2. Math.random() : returns a pseudorandom double type number (range: 0<=x<1)
// 3. 9가지 case에 대해 일일이 나열하지 않고, 수식 계산을 통해 비교할 수 있도록 작성

import java.util.Scanner;
public class No3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int S = 0;
        final int R = 1;
        final int P = 2;

        System.out.println("가위(0), 바위(1), 보(2): ");
        int num = sc.nextInt();

        int ran = (int) (Math.random() * 3);
        System.out.println(ran);

        if (num == ran)
            System.out.println("컴퓨터와 비겼음\n");
        else if (num - ran == 1 || num - ran == -2)     // 사람이 이기는 경우: 1 0 / 2 1 / 0 2 (num ran)
        {
            System.out.print("사람: " + num + ", 컴퓨터: " + ran + "> 사람 승리\n");
        } else if (num - ran == -1 || num - ran == 2)   // 컴퓨터가 이기는 경우: 0 1 / 1 2 / 2 0 (num ran)
        {
            System.out.println("사람: " + num + ", 컴퓨터: " + ran + "> 컴퓨터 승리\n");
        }
    }
}
