// 성적을 입력 받아서 배열에 저장했다가 합계와 평균을 구하는 프로그램
// -1이 입력되면 반복 종료

import java.util.Scanner;

public class No5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float sum = 0;
        int cnt = 0;
        while (true) {
            System.out.println("성적을 입력하세요: ");
            int score = sc.nextInt();

            if (score == -1)
                break;
            else {
                sum += score;
                cnt += 1;
            }
        }
        System.out.printf("합계 : %.1f\n", sum);
        System.out.printf("평균 : %.1f", sum / cnt);
    }
}
