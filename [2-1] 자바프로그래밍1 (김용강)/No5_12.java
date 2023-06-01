// String 2차원 배열을 만들고, row 0 과 col 0은 각 인덱스 표현
// 6 x 6 입력 시, 7 x 7 배열 생성 후 아래 그림과 같이 초기화 (참고: Integer.toString)
// 사용자에게 행과 열을 입력 받아 해당 좌표 값을 X로 표시
// row 99 입력 시 종료

import java.util.Scanner;

public class No5_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input matrix size (row, col) : ");
        int r_size = sc.nextInt();
        int c_size = sc.nextInt();

        String[][] arr = new String[r_size + 2][c_size + 2];

        for (int i = 0; i < r_size; i++) {
            if (i == 0) {
                System.out.print("  ");
                for (int j = 0; j < c_size; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }

            for (int j = 0; j < c_size; j++) {
                if (j == 0) {
                    System.out.print(i + " ");
                }
                arr[i][j] = "0 ";
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        while (true) {
            System.out.print("Row index : ");
            int r_index = sc.nextInt();

            if (r_index == 99) {
                System.out.println("End");
                return;
            } else {
                System.out.print("Column index : ");
                int c_index = sc.nextInt();

                arr[r_index][c_index] = "X ";

                System.out.print("  ");
                for (int j = 0; j < c_size; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();

                for (int i = 0; i < r_size; i++) {
                    for (int j = 0; j < c_size; j++) {
                        if (j == 0) {
                            System.out.print(i + " ");
                        }
                        System.out.print(arr[i][j]);
                    }
                    System.out.println();
                }
            }
        }
    }
}
