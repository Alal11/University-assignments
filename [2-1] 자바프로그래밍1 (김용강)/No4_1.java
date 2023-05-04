// 구구단 출력 프로그램 작성 (세 단 씩 출력)

public class No4_1 {
    public static void main(String[] args) {

        for (int i = 1; i <= 9; i = i + 3) {
            System.out.print(i + "단\t\t" + (i + 1) + "단\t\t" + (i + 2) + "단\n");
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
                System.out.print((i + 1) + "*" + j + "=" + (i + 1) * j + "\t");
                System.out.print((i + 2) + "*" + j + "=" + (i + 2) * j + "\n");
            }
            System.out.println();
        }
    }
}
