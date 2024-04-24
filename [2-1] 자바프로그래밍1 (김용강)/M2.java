package 중간고사8;

import java.util.Scanner;

public class M2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int R = 0;
        final int P = 1;
        final int S = 2;


        System.out.print("Enter the number of back Paper Scissors: ");
        int cnt = sc.nextInt();

        int[][] arr = new int[2][cnt];      // 가위바위보 결과 저장할 2차원 배열 선언

        int n_win = 0;
        int r_win = 0;

        String gg = "";

        for (int i = 0; i < cnt; i++) {
            System.out.print("Rock(0), Paper(1), Scissors(2) : ");
            int num = sc.nextInt();

            int ran = (int) (Math.random() * 3);

            if (num - ran == 1 || num - ran == -2)     // 사람이 이기는 경우: 1 0 / 0 2 / 2 1 (num ran)
            {
                n_win++;

            } else if (num - ran == -1 || num - ran == 2)   // 컴퓨터가 이기는 경우: 2 0 / 0 1 / 1 2 (num ran)
            {
                r_win++;
            }

            // 값 저장
            arr[0][i] = num;
            arr[1][i] = ran;

        }

        for (int i = 0; i < cnt; i++) {
            if (i == 0) {
                System.out.print("Match\t\tcomputer\t\tPlayer\t\tResult\n");
            }

            if (arr[0][i] == arr[1][i]) {
                gg = "비김";
            } else if (arr[0][i] - arr[1][i] == -1 || arr[0][i] - arr[1][i] == 2) {
                gg = "Computer win";
            } else if (arr[0][i] - arr[1][i] == 1 || arr[0][i] - arr[1][i] == -2) {
                gg = "player win";
            }

            System.out.print(i + 1 + "\t\t\t\t" + arr[1][i] + "\t\t\t\t" + arr[0][i] + "\t\t\t" + gg + "\n");
        }


        System.out.println("Total\t\t\t" + r_win + "\t\t\t\t" + n_win + "\t\t\t-");

    }
}
