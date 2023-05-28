// 아래와 같은 2차원 배열에 대해 전체 요소 값을 화면에 출력
// int[][] a={{1,2,3},{1,2},{1},{1,2,3}}

public class No5_9 {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {1, 2}, {1}, {1, 2, 3}};

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
