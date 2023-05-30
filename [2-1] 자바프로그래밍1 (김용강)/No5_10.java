// 3x5 크기의 2차원 배열을 생성하고 0으로 초기화
// 5개의 0을 랜덤하게 1로 바꾸기
// Math.random() 활용
public class No5_10 {
    public static void main(String[] args) {

        // 3x5 크기의 2차원 배열 생성 및 초기화
        int[][] arr = new int[3][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 0;
            }
        }

        // 5개의 0을 랜덤하게 1로 바꾸기 (while문도 가능)
        for (int cnt = 0; cnt < 5; ) {
            int r = (int) (Math.random() * 3);
            int c = (int) (Math.random() * 5);

            if (arr[r][c] == 0) {
                arr[r][c] = 1;
                cnt++;
            }
        }

        // 2차원 배열 출력
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
