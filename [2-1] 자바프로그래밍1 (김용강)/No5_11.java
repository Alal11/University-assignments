// 3x4 크기의 2차원 배열을 만들고 0~9 범위의 정수를 랜덤하게 저장
// 해당 배열에 저장된 정수 합을 출력

public class No5_11 {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = (int) (Math.random() * 10);

                System.out.print(arr[i][j] + "\t\t");

                sum += arr[i][j];
            }
            System.out.print("\n");
        }
        System.out.println("합은 " + sum);
    }
}
